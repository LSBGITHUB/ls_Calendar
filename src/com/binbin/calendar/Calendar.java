package com.binbin.calendar;

import java.util.Scanner;

/**
 * ����
 * @author Administrator
 *
 */
public class Calendar {
     public static void main(String[] args) {
    	 
		Scanner in=new Scanner(System.in);
    	 System.out.println("���������");
    	 int year=in.nextInt();
    	 System.out.println("�������·�");
    	 int month=in.nextInt();
		 int sum=0;//����
		 int day=0;
		//�����1990�굽2016�����������
		for(int i=1900;i<year;i++){
			if(i%4==0&&i%100!=0||i%400==0){
				sum+=366;
			}else{
				sum+=365;
			}
		}
		
		//�����·�
		for(int i=1;i<month;i++){
			//�ж�2�·�
			if(i==2){
				//�ж��Ƿ�Ϊ����
				if(year%4==0&&year%100!=0||year%400==0){
					sum+=29;
				}else{
					sum+=28;
				}
			}else{
				//�ж��Ƿ�С��
				if(i==4||i==6||i==9||i==11){
					sum+=30;
				}else{
					sum+=31;
				}
			}
		}
		sum+=1;
		
		
		
		//�ж�2�·�
		//�����·�����������һ��������
		if(month==2){
			//�ж��Ƿ�Ϊ����
			if(year%4==0&&year%100!=0||year%400==0){
				day=29;
			}else{
				day=28;
			}
		}else{
			//�ж��Ƿ�С��
			if(month==4||month==6||month==9||month==11){
				day=30;
			}else{
				day=31;
			}
		}
		
/*		switch (month) {
	      case 4:
	      case 6:
	      case 9:
	      case 11:
	           day=30;
		       break;
	      case 1:
	      case 3:
	      case 5:
	      case 7:
	      case 8:
	      case 10:
	      case 12:
	    	   day=31;
	    	   break;
	default:
		if(year%4==0&&year%100!=0||year%400==0){
			day=29;
		}else{
			day=28;
		}
		break;
	}*/
		
		
		//����
		//System.out.println("1990��1��1�յ�2016��5��7��һ��"+sum+"��");
		//������%7�͵������ڼ�
		//System.out.println("2016��4��7��"+sum%7);
		int wekday=sum%7;//����
		System.out.println("��\tһ\t��\t��\t��\t��\t��");
		for(int i=1;i<=wekday;i++){
			System.out.print("\t");
		}
//		System.out.print("2");
		//�����������
		for(int i=1;i<=day;i++){
			if(sum%7==6){
				System.out.print(i+"\n");
			}else{
				System.out.print(i+"\t");
			}
			sum++;
		}
	
	}
}
