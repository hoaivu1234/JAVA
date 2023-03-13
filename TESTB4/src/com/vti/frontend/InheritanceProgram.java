package com.vti.frontend;
import com.vti.backend.QLCB;

import java.util.Scanner;

public class InheritanceProgram {
    public static void main(String[] args) {

        question1_2();

    }

    private static void menuQuesion1_2() {
        System.out.println("=======MENU==========");
        System.out.println("==  1. Thêm cán bộ ==");
        System.out.println("==  2. Hiện cán bộ ==");
        System.out.println("==  3. Tìm cán bộ  ==");
        System.out.println("==  4. Xóa cán bộ  ==");
        System.out.println("==  0. Thoát       ==");
        System.out.println("=====================");
    }

    public static void question1_2() {
        QLCB qlcb = new QLCB();

        byte choose;
        do {
            Scanner scanner = new Scanner(System.in);
            menuQuesion1_2();
            choose = scanner.nextByte();

            switch (choose) {
                case 1:
                    qlcb.addCanBo();
                    break;
                case 2:
                    qlcb.printInforCanBo();
                    break;
                case 3:
                    qlcb.findCanBo();
                    break;
                case 4:
                    qlcb.deleteCanBo();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Nhập sai ! Nhập lại !");
                    break;
            }
        } while (choose != 0);

    }
}
