package application;

import entities.Room;

import java.util.Scanner;

public class ExercicioPensionado {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many rooms will be rented? ");
        int numberRooms = input.nextInt();
        Room[] rooms = new Room[10];

        for (int i = 0; i < numberRooms; i++) {
            System.out.println("Rent #" + (i + 1));
            System.out.print("Name: ");
            String name = input.next();
            input.nextLine();

            System.out.print("Email: ");
            String email = input.nextLine();

            System.out.print("Room: ");
            int room = input.nextInt();

            rooms[room] = new Room(name, email, room);
        }

        System.out.println("Busy rooms:");
        for (int i = 0; i < rooms.length; i++) {
            if(rooms[i] != null)
                System.out.println(rooms[i]);
        }

        input.close();
    }
}
