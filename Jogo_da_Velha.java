/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogodavelha;

import java.util.Scanner;

/**
 *
 * @author Lab08-MicroProf
 */
public class JogoDaVelha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
		
		String[][] a = new String[3][3];
		
		//int x linha; int y coluna		
		int x,y;
		
		//jogador 1 = x jogador 2 0
		
		//contador para os jogadores a cada jogada
		int cont =0;
		String jogada;
		
		
		for(int i=0;i<=2;i++){
			for(int j=0;j<=2;j++) {
				
				if(cont %2 ==0) {
					jogada = "X";
				}
				else {
					jogada = "0";
				}
				cont++;
				System.out.println("Jogada "+(cont));
				System.out.println("Digite a linha: ");
				x = sc.nextInt();
				
				
				
				System.out.println("Digite a coluna: ");
				y = sc.nextInt();
				
				a[x][y] = jogada;				
			}
		}
		
		for(int i=0;i<=2;i++){
			for(int j=0;j<=2;j++) {			
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
        
        
    }
    
}
