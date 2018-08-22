package com.zhanghao.test;

import java.util.Stack;

/**
 * Created by hasee on 2017/6/28.
 */
public class CH02_02 {
    public static void MatrixAdd(int arrA[][],int arrB[][],int arrC[][],int dimX ,int dimY){
        int row ,col;
        if(dimX <=0||dimY <=0){
            System.out.println();
            return;
        }
      for(row =1 ;row <= dimX ;row ++){
        for(col =1 ; col <= dimY ;col ++){
            arrC[row-1][col-1] =arrA[row-1][col-1]+arrB[row-1][col-1];
        }
      }
    }

    public static void MatriMotifiied(int arrA[][],int arrB[][],int arrC[][],int dimX,int dimY){



    }
    public static void main(String[] args) {
        int i ;
        int j;
        final int ROWS =3;
        final int COLS =3;
        int[][] A={{1,3,5},{7,9,11},{13,15,17}};
        int[][] B ={{9,8,7},{6,5,4},{3,2,1}};
        int[][] C =new int[ROWS][COLS];
        MatrixAdd(A,B,C,3,3);
        for(i = 0;i < 3;i ++){
            for(j = 0;j < 3;j ++){
                System.out.print(C[i][j] + "\t");
            }
            System.out.println();
        }

    }

}

