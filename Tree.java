// 아직 너무 어렵다 차근 차근 보면서 공부해야 함.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class tree {
    static int[] values;
    static char[] operators;
    static int[][] tree;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        
        for (int t = 1; t <= 10; t++) {
            int N = Integer.parseInt(bf.readLine());
            values = new int[N + 1];
            operators = new char[N + 1];
            tree = new int[N + 1][3];

            for (int i = 1; i <= N; i++) {
                StringTokenizer st = new StringTokenizer(bf.readLine());
                int node = Integer.parseInt(st.nextToken());
                if (st.countTokens() == 1) {
                    values[node] = Integer.parseInt(st.nextToken());
                } else {
                    operators[node] = st.nextToken().charAt(0);
                    tree[node][0] = Integer.parseInt(st.nextToken());
                    tree[node][1] = Integer.parseInt(st.nextToken());
                }
            }

            int result = calculate(1);
            System.out.println("#" + t + " " + result);
        }
    }

    private static int calculate(int node) {
        if (values[node] != 0) {
            return values[node];
        }

        int leftValue = calculate(tree[node][0]);
        int rightValue = calculate(tree[node][1]);

        char operator = operators[node];
        switch (operator) {
            case '+':
                return leftValue + rightValue;
            case '-':
                return leftValue - rightValue;
            case '*':
                return leftValue * rightValue;
            case '/':
                return leftValue / rightValue;
            default:
                return 0;
        }
    }
}
