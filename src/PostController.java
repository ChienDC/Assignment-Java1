import java.util.ArrayList;
import java.util.Scanner;

public class PostController {
    ArrayList<PostList> postLists = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    // Thêm mới bài viết
    public void createPostList() {
        System.out.println("Nhập Id bài đăng: ");
        long postID = scanner.nextLong();
        scanner.nextLine();
        System.out.println("Nhập tiêu đề bài đăng: ");
        String articleTitle = scanner.nextLine();
        System.out.println("Nhập mô tả: ");
        String describe = scanner.nextLine();
        System.out.println("Nhập hình đại diện ( Có thể nhập liên kết hoặc URL): ");
        String avatar = scanner.nextLine();
        System.out.println("Nhập tên Tác giả: ");
        String writer = scanner.nextLine();
        System.out.println("Nhập ngày viết: ");
        String date = scanner.nextLine();
        PostList plist = new PostList();
        postLists.add(plist);
        plist.setId(postID);
        plist.setArticleTitle(articleTitle);
        plist.setDescribe(describe);
        plist.setAvatar(avatar);
        plist.setWriter(writer);
        plist.setDateofwriting(date);
        System.out.println("Đã lưu thành công." );
    }
    // Hiển thị danh sách bài viết vừa nhập
    public void showPostList() {
        System.out.printf("%-10s ||%-20s ||%-10s ||%-20s ||%-10s ||%-10s\n", "Id", "Tiêu đề bài viết", "Mô tả", "Ảnh đại diện", "Tác giả", "Ngày viết");
        for (int i = 0; i < postLists.size(); i++) {
            PostList pl = postLists.get(i);
            System.out.printf("%-10s ||%-20s ||%-10s ||%-20s ||%-10s ||%-10s\n", pl.getId(), pl.getArticleTitle(), pl.getDescribe(), pl.getAvatar(), pl.getWriter(), pl.getDateofwriting());
        }
        System.out.println("Nhấn Enter để tiếp tục.");
        scanner.nextLine();
    }
    // Tìm kiếm bài viết theo mã
    public void searchPostList() {
        System.out.println("Nhập Id bài đăng: ");
        long postID = scanner.nextLong();
        scanner.nextLine();
        long key = -1;
        for (int i = 0; i < postLists.size(); i++) {
            PostList pl = postLists.get(i);
            if (pl.getId() == postID) {
                key = postID;
                System.out.printf("%-10s ||%-20s ||%-10s ||%-20s ||%-10s ||%-10s\n", "Id", "Tiêu đề bài viết", "Mô tả", "Ảnh đại diện", "Tác giả", "Ngày viết");
                System.out.printf("%-10s ||%-20s ||%-10s ||%-20s ||%-10s ||%-10s\n", pl.getId(), pl.getArticleTitle(), pl.getDescribe(), pl.getAvatar(), pl.getWriter(), pl.getDateofwriting());
            }
        }
        if (key == -1) {
            System.out.println("Không tìm thấy bài đăng.");
        }
    }
    // Delete bài viết theo mã
    public void deletePostList() {
        System.out.println("Nhập Id bài đăng: ");
        long postID = scanner.nextLong();
        scanner.nextLine();
        long key = -1;
        for (int i = 0; i < postLists.size(); i++) {
            PostList pl = postLists.get(i);
            if (pl.getId() == postID) {
                key = postID;
                postLists.remove(i);
                System.out.println("Đã xóa thành công.");
            }
        }
        if (key == -1) {
            System.out.println("Không tìm thấy bài đăng.");
        }
    }
}