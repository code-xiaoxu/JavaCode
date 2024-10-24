package com.xuxi.sparsearray;

public class SparseArray {
    public static void main(String[] args) {
        int[][] chessArr1 = new int[11][11];
        chessArr1[1][2] = 1;
        chessArr1[3][4] = 2;
        System.out.println("原二维数组为：");
        for(int[] row : chessArr1){
            for(int data : row){
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }
        int sum = 0;
        for(int[] row :chessArr1){
            for(int data : row){
                if(data != 0){
                    sum++;
                }
            }
        }
        int [][] sparseArray = new int[sum+1][3];
        sparseArray[0][0] = 11;
        sparseArray[0][1] = 11;
        sparseArray[0][2] = sum;
        int count = 0;
        for(int i = 0; i < 11; i++){
            for(int j = 0; j < 11; j++){
               if(chessArr1[i][j] != 0){
                   count++;
                   sparseArray[count][0] = i;
                   sparseArray[count][1] = j;
                   sparseArray[count][2] = chessArr1[i][j];
               }
            }
        }
        System.out.println("稀疏数组为：");
        for(int[] row : sparseArray){
            for(int data : row){
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }
        int[][] chessArr2  = new int[sparseArray[0][0]][sparseArray[0][1]];
        for(int i = 1; i <sparseArray.length; i++){
            chessArr2[sparseArray[i][0]][sparseArray[i][1]] = sparseArray[i][2];
        }
        System.out.println("还原的二维数组为：");
        for(int[] row : chessArr2){
            for(int data : row){
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }
    }
}
