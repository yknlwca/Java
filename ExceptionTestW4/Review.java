package com.ssafy.ws.step4;

/**
 * 리뷰 정보를 나타내는 클래스
 */
public class Review {
	//코드를 작성해주세요. 
	public int reviewId;
	public int resId;
	public String writer;
	public String content;
	
	public Review() {}

	public Review(int reviewId, int resId, String writer, String content) {
		super();
		this.reviewId = reviewId;
		this.resId = resId;
		this.writer = writer;
		this.content = content;
	}

	@Override
	public String toString() {
		return "Review [reviewId=" + reviewId + ", resId=" + resId + ", writer=" + writer + ", content=" + content
				+ "]";
	}

	public int getReviewId() {
		return reviewId;
	}

	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
	}

	public int getResId() {
		return resId;
	}

	public void setResId(int resId) {
		this.resId = resId;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	
}
