package exercicios;

import java.util.Scanner;

public class ExercicioPraticoLista2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt(), b = sc.nextInt();
		
		int [][] mat = new int [a][b];
		
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		int igual = sc.nextInt();
		
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				if(igual == mat[i][j]) {
					System.out.println("Position "+ i +","+ j +":");
						if(i > 0) { //linha de cima
							System.out.println("Up: "+ mat[i-1][j]);
						}
						if(i < 2) { //linha de baixo
							System.out.println("Down: "+ mat[i+1][j]);
						}
						if(j > 0) { // esquerda
							System.out.println("Left: "+ mat[i][j-1]);
						}
						if(j < 3) { // direita
							System.out.println("Right: "+ mat[i][j+1]);
							break;
						}
					}
				}
			}
		
		sc.close();
	}

}
