package j0305;

import java.io.*;

/*
 * 메모리에 각각의 자료형에 맞게 저장된 데이터(변수에 저장) -> 파일 저장(string, int, double, char)
 * 자료형에 맞게 파일에 저장시키고 싶을 경우 :
 *  DataOutputStream (FileOutputStream)
 * */
public class DataOutputTest {
    public static void main(String[] args) throws Exception{

        // 1. 파일로 저장
        FileOutputStream fos = new FileOutputStream("C:/webtest/3.JAVA/과제/data.txt");

        // 2. 자바의 자료형에 맞게 포장(DataOutputStream)
        DataOutputStream dos = new DataOutputStream(fos);

        // 3. 메모리
        char han = '한'; // 0~65535
        System.out.println((int)han);

        byte b=21;
        String str = "bg\n";
        byte ba[] = {65, 66, 67}; // A,B,C

        // 파일로 저장
        // 표현식) write 자료형(저장할 값)   <---> read 자료형()
        dos.writeChar(han); // '한'
        dos.writeByte(b); // ~readbyte
        dos.writeBytes(str);
        dos.write(ba);

        dos.close();
        fos.close();

        // 추가코딩 : 만들어진 파일의 내용을 다시 읽어들여서 출력하여 확인
        DataInputStream dis = new DataInputStream(new FileInputStream("C:/webtest/3.JAVA/과제/data.txt"));

        // 변수 = dis.read 자료형()  <-> dos.write 자료형(저장할 값)
        char c = dis.readChar(); // 한이 들어있는가
        byte b1 = dis.readByte(); // 21이 나오는지
        String s = dis.readLine(); // bg 가 나오는지 (readBytes 가 아닌 readLine() 으로 읽어야함)
        byte bb[] = new byte[3]; // 65,66,67
        dis.read(bb); // 파일에 저장된 byte 값을 배열 bb에 저장하라

        dis.close();

        // 확인해보기
        System.out.println("bb = " + bb);
        System.out.println("b1 = " + b1);
        System.out.println("s = " + s);
        System.out.println("c = " + c);


        System.out.println("=================");
        byte t[] = s.getBytes();
        for (byte b3 : t) {
            System.out.println((char)b3);

        }
        //byte[] = String 에 저장
        String str2 = new String(bb); // 생성자 (byte[])
        System.out.println("str2 = " + str2); // ABC
        //---------------------
        System.out.println("=================");
        for(byte b2:bb){
            System.out.println((char)b2+"\t");
        }
    }
}
