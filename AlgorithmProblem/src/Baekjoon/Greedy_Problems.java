package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Greedy_Problems{
    public static void main(String[] args){
        
    	
//    * Problem 11399: 줄을 [2, 5, 1, 4, 3] 순서로 줄을 서면, 2번 사람은 1분만에, 5번 사람은 1+2 = 3분, 1번 사람은 1+2+3 = 6분, 4번 사람은 1+2+3+3 = 9분, 3번 사람은 1+2+3+3+4 = 13분이 걸리게 된다. 
//    		각 사람이 돈을 인출하는데 필요한 시간의 합은 1+3+6+9+13 = 32분이다. 이 방법보다 더 필요한 시간의 합을 최소로 만들 수는 없다.
//      
//    	Scanner sc = new Scanner(System.in);
//        
//        int num = sc.nextInt();
//        int[] arr = new int[num];
//        
//        for(int i=0; i<num; i++){
//            arr[i] = sc.nextInt();
//        }
//        // Arrays.sort 메소드를 이용하면 ascending 순서로 숫자가 정렬된
//        Arrays.sort(arr);
//        
//        int min = 0;
//        int total = 0;
//        for(int i=0; i< arr.length; i++) {
//        	min += arr[i];
//        	total += min;
//        	
//        }
//        System.out.println(total);
//       
//        input: 5			output: 32
//        	   3 3 1 2 4
        
//    	* Problem 11047:준규가 가지고 있는 동전은 총 N종류이고, 각각의 동전을 매우 많이 가지고 있다.
//    						동전을 적절히 사용해서 그 가치의 합을 K로 만들려고 한다. 이때 필요한 동전 개수의 최솟값을 구하는 프로그램을 작성하시오.
//    							첫째 줄에 N과 K가 주어진다. (1 ≤ N ≤ 10, 1 ≤ K ≤ 100,000,000)
//    								둘째 줄부터 N개의 줄에 동전의 가치 Ai가 오름차순으로 주어진다. (1 ≤ Ai ≤ 1,000,000, A1 = 1, i ≥ 2인 경우에 Ai는 Ai-1의 배수)
//    		
//    	Scanner sc = new Scanner(System.in);
//        
//        int N = sc.nextInt();
//        int K = sc.nextInt();
//        int[] arr = new int[N];
//        int count= 0;
//        for(int i = 0; i < N; i++){
//            arr[i] = sc.nextInt();
//        }
//        for(int i = N-1; i >= 0; i--){ // 높은숫자부터 계
//            if(K >= arr[i]){	// 금액이 동전 가치보다 클경우 
//                count += K/arr[i]; // 4200원 / 1000원 = 4.2 4개로들어가고 
//                K = K%arr[i]; 200원이 새로운 K값이된다;
//            }
//        }
//        System.out.println(count);
//    	
//        input:  10 4200					output: 6
//		        1
//		        5
//		        10
//		        50
//		        100
//		        500
//		        1000
//		        5000
//		        10000
//		        50000
    	
//    * Problem 5585: 타로는 자주 JOI잡화점에서 물건을 산다. JOI잡화점에는 잔돈으로 500엔, 100엔, 50엔, 10엔, 5엔, 1엔이 충분히 있고, 언제나 거스름돈 개수가 가장 적게 잔돈을 준다. 
//    					타로가 JOI잡화점에서 물건을 사고 카운터에서 1000엔 지폐를 한장 냈을 때, 받을 잔돈에 포함된 잔돈의 개수를 구하는 프로그램을 작성하시오.
//    	 Scanner sc = new Scanner(System.in);
//          
//         int pay = sc.nextInt();
//         int[] arr = new int[]{500,100,50,10,5,1};
//          
//         int change = 1000 - pay;
//         int count = 0;
//         
//         for(int i=0; i<arr.length; i++){       
//                 if(change >= arr[i]){
//                 
//                   count += change/arr[i];
//                   change = change%arr[i];
//                 }
//         }
//          System.out.println(count);
//          
//          input: 380			output: 4  // 620원  500원 1개 100원 1개 십원 2


//      * Problem 2217: 첫째 줄에 정수 N이 주어진다. 다음 N개의 줄에는 각 로프가 버틸 수 있는 최대 중량이 주어진다. 이 값은 10,000을 넘지 않는 자연수이다.
//    	  
//    	   Scanner sc = new Scanner(System.in);
//    
//		    int num = sc.nextInt();
//		    
//		    int[] arr = new int[num];
//		    for(int i=0; i< num; i++){
//		         arr[i] = sc.nextInt();  
//		    }
//		    Arrays.sort(arr);
//		     
//		    for(int i=0; i<arr.length; i++){
//		        arr[i] = arr[i] * (num -i); //최대값 넣어주기 
//		    }
//		    Arrays.sort(arr); // 큰숫자로 정렬 
//		    System.out.println(arr[num-1]); //마지막 최대값 출력
//		    
//		    input: 2 			output: 30
//		    	   15 20    
    	
//		* Problem 10610: 어느 날, 미르코는 우연히 길거리에서 양수 N을 보았다. 미르코는 30이란 수를 존경하기 때문에, 그는 길거리에서 찾은 수에 포함된 숫자들을 섞어 30의 배수가 되는 가장 큰 수를 만들고 싶어한다.
//  							미르코를 도와 그가 만들고 싶어하는 수를 계산하는 프로그램을 작성하라. 만약 그숫자가안만들어지면 -1 출	
//		문제조건 받은 숫자를 정해서 섞어서 30배수가 되는 가장 큰 숫자를 만들려면
//					마지막은 0으로 끝나면서 다 더했을때 3으로 나누면 0으로떨어지는 숫자여야한다 
//    	Scanner sc = new Scanner(System.in);
//    	
//    	String num = sc.next();
//    	int[] arr = new int[num.length()];
//    	int sum = 0; 
//    	
//    	for(int i=0; i<arr.length; i++) {
//    		arr[i] = num.charAt(i) - '0'; // change string character to int
//    		
//    		sum += arr[i]; // declare sum if it can be divided by 3.
//    	}
//    	Arrays.sort(arr);	// sort an array from smallest number to largest number
//    	if(sum % 3 == 0 && arr[0] == 0) {
//    		for(int i = arr.length -1; i >= 0; i--) {
//    			System.out.print(arr[i] + "");
//    		}
//    	}
//    		else {
//    			System.out.println(-1);
//    		
//    	}
//     
//    	input: 102			output: 210
//    	input: 2931			output: -1
    
//    	* Problem 1541: 첫째 줄에 식이 주어진다. 식은 ‘0’~‘9’, ‘+’, 그리고 ‘-’만으로 이루어져 있고, 가장 처음과 마지막 문자는 숫자이다. 그리고 연속해서 두 개 이상의 연산자가 나타나지 않고, 5자리보다 많이 연속되는 숫자는 없다. 수는 0으로 시작할 수 있다.
//         조건: -로시작하는 자리 뒤에 (를 추가하고 새로은 -로시작하기전에 )를 추가한다
    

    
    
    
    
    
    
    
    
    
    }
    
    
    
    
}