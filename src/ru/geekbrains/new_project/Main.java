package ru.geekbrains.new_project;

public class Main {

    public static void main(String[] args) {
	int[] mass = new int[8];

        int[] arr = new int[8];

        for (int i = 0, count = 0; i < arr.length; i++, count +=3) {
            arr[i] = count;
            System.out.print(arr[i] + " ");
        }
            
        }
    }

