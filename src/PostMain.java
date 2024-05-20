import java.util.Scanner;

public class PostMain {
    public static void main(String[] args) {
        choice();
    }
    public static void choice() {
        Scanner scanner = new Scanner(System.in);
        PostController postController = new PostController();
        postController.createPostList();
        boolean flag = true;
        while (flag) {
            System.out.println("Nhập lựa chọn của bạn :");
            System.out.println("1. Thêm mới bài viết.");
            System.out.println("2. Hiển thị bài đăng.");
            System.out.println("3. Tìm kiếm bài viết.");
            System.out.println("4. Xóa bài viết.");
            System.out.println("5. Thoát chương trình.");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    postController.createPostList();
                    break;
                case 2:
                    postController.showPostList();
                    break;
                case 3:
                    postController.searchPostList();
                    break;
                case 4:
                    postController.deletePostList();
                    break;
                case 5:
                    flag = false;
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }
}