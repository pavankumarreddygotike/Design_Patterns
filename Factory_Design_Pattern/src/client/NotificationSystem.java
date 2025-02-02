package client;

import java.util.Scanner;

import factory.NotificationFactory;
import model.Notification;

public class NotificationSystem {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Notification Type (SMS, EMAIL, PUSH): ");
		String notificationType = scanner.nextLine().toUpperCase();

		Notification notification = NotificationFactory.getNotification(notificationType);

		if (notification != null) {
			notification.notifyUser();
		} else {
			System.out.println("Invalid Notification Type.");
		}

		scanner.close();
	}
}
