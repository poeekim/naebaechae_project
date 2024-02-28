package j0228;

public class ArrayTestTotal2 {
    public static void main(String[] args) {
        // 1차원 배열 문제

        int b[] = {58, 38, 12, 36, 41, 27, 26, 32, 59, 16, 18, 28, 21, 17};

        int cnt[] = new int[5];

        for (int i = 0; i < b.length; i++) {
            if (b[i] >= 10 && b[i] <= 19) {
                cnt[0]++;
            }if (b[i] >= 20 && b[i] <= 29) {
                cnt[1]++;
            }if (b[i] >= 30 && b[i] <= 39) {
                cnt[2]++;
            }if (b[i] >= 40 && b[i] <= 49) {
                cnt[3]++;
            }if (b[i] >= 50 && b[i] <= 59) {
                cnt[4]++;
            }

        }

        for (int j = 0; j < cnt.length; j++) {
            System.out.println((j + 1) * 10 + "대 인원수 = " + cnt[j] + "명");
        }

        }

}
