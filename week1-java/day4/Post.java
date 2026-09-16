package day4;

public class Post {
    int id;
    String title;
    String content;
    String author;

    Post(int id, String title, String content, String author) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void showPost() {
        System.out.println("게시글 번호: "+this.id);
        System.out.println("제목: "+this.title);
        System.out.println("내용: "+this.content);
        System.out.println("작성자: "+this.author);
    }
    public static void main(String[] args) {
        Post post = new Post(
            1,
            "Java 공부",
            "오늘은 Java를 공부했다.",
            "윤환");
        post.showPost();
    }
}
