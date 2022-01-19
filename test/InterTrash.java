public class InterTrash {

  public static void main(String[] args) {
    String result = "";
      for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
          result += board[i][j];
        }
      }
      for (int i = 0; i < 3; i++) {
        for (int j = 3; j < 6; j++) {
          result += board[i][j];
        }
      }
      for (int i = 0; i < 3; i++) {
        for (int j = 6; j < 9; j++) {
          result += board[i][j];
        }
      }
      for (int i = 3; i < 6; i++) {
        for (j = 0; j < 3; j++) {
          result += board[i][j];
        }
      }
      for (int i = 3; i < 6; i++) {
        for (int j = 3; j < 6; j++) {
          result += board[i][j];
        }
      }
      for (int i = 3; i < 6; i++) {
        for (int j = 6; j < 9; j++) {
          result += board[i][j];
        }
      }
      for (int i = 6; i < 9; i++) {
        for (int j = 0; j < 3; j++) {
          result += board[i][j];
        }
      }
      for (int i = 6; i < 9; i++) {
        for (int j = 3; j < 6; j++) {
          result += board[i][j];
        }
      }
      for (int i = 6; i < 9; i++) {
        for (int j = 6; j < 9; j++) {
          result += board[i][j];
        }
      }
     System.out.println(result);

}
