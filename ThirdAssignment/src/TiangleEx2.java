/* 02 별 찍기(2)
    "숫자를 입력하세요"라는 입력창을 만든 후
    출력 결과(1)과 출력 결과(2)를 보고 규칙을 유추하여 별을 출력해 보세요.
    (입력창에 들어가는 숫자의 범위는 1부터 100까지 입니다.)
 */

import java.io.IOException;

//출력 결과(1)
//숫자를 입력하세요 3
//1
//*
//2
//*
//**
//3
//*
//**
//***
//
//출력 결과(2)
//숫자를 입력하세요 5
//1
//*
//2
//*
//**
//3
//*
//**
//***
//4
//*
//**
//***
//****
//5
//*
//**
//***
//****
//*****
public class TiangleEx2 {
    public static void main(String[] args) throws IOException{
        System.out.println("숫자를 입력하세요 ");

        int Number;
        try {
            Number = System.in.read();
            //System.out.println(Number);

            // 다음 라인에 코드를 작성 해 주세요.

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
