package practice;

public class ArrayTestTotal {
    public static void main(String[] args) {

        int b[] = {58, 38, 12, 36, 41, 27, 26, 32, 59, 16, 18, 28, 21, 17};
        int count[] = new int[5];


        for (int i = 0; i < b.length; i++) {
            switch (b[i] / 10) {
                case 1:
                    count[0]++;
                    break;
                case 2:
                    count[1]++;
                    break;
                case 3:
                    count[2]++;
                    break;
                case 4:
                    count[3]++;
                    break;
                case 5:
                    count[4]++;
                    break;
            }
        }

            for (int j = 0; j < count.length; j++) {
                System.out.println((j + 1) * 10 + "대 인원수 = " + count[j] + "명");
            }

        }

    }
