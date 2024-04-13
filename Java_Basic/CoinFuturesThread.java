import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.StringTokenizer;

public class CoinFuturesThread {
    public static int nowPrice;
    public static String stop;
    
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws InterruptedException {
        
        Runnable r1 = new getPriceThread();
        Runnable r2 = new stopThread();
        
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        
        t1.start();
        t2.start();
        
        t1.join();
        t2.join();
        
        System.out.println("end");
    }
    
    static class getPriceThread implements Runnable{

        @Override
        public void run() {
            StringTokenizer st;
            while(stop == null) {
                HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://api.bithumb.com/public/ticker/BTC_KRW"))
                        .header("accept", "application/json").method("GET", HttpRequest.BodyPublishers.noBody()).build();
                HttpResponse<String> response = null;
                try {
                    response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
                } catch (IOException | InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                st = new StringTokenizer(response.body(), ",");
                st.nextToken();
                st.nextToken();
                String str = st.nextToken();
                st = new StringTokenizer(str, "\":");
                st.nextToken();
                nowPrice = Integer.parseInt(st.nextToken());
                System.out.print("현재가 : " + nowPrice);
                System.out.println(" 포지션 종료하려면 아무키나 입력");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
        
    }
    
    static class stopThread implements Runnable{

        @Override
        public void run() {
            try {
                stop = br.readLine();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
