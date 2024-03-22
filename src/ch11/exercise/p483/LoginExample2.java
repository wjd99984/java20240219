package ch11.exercise.p483;


import java.util.Scanner;

public class LoginExample2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("아이디를 입력하세요:");
        String id = scanner.nextLine();

        System.out.println("패스워드를 입력하세요:");
        String password = scanner.nextLine();

        try {
            login(id, password);
            System.out.println("로그인 성공!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }

    public static void login(String id, String password) throws Exception {
        if (id.equals("blue") && password.equals("54321")) {
            return;
        }

        if (!id.equals("blue")) {
            throw new NotExistIDException("아이디가 존재하지 않습니다");
        }
        if (!password.equals("54321")) {
            throw new WrongPasswordException("패스워드가 틀립니다");
        }

    }
}
