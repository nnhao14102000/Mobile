package dev.nnhao.notification;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private NotificationManager manager;
    private int notificationID = 999;
    private int numMsg = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickToStart(View view) {
        displayNotification();
    }

    private void displayNotification() {
        NotificationCompat.Builder builder = new NotificationCompat.Builder(
                this
        );

        builder.setContentTitle("New Message");
        builder.setContentText("Nofication Demo: message has received");
        builder.setTicker("Message Alert");
        builder.setSmallIcon(R.drawable.ic_action_unread);
        builder.setNumber(++numMsg);

        Intent intent = new Intent(this, NotificationActivity.class);

        TaskStackBuilder stack = TaskStackBuilder.create(this);
        stack.addParentStack(NotificationActivity.class);
        stack.addNextIntent(intent);

        PendingIntent pending = stack.getPendingIntent(0,
                PendingIntent.FLAG_UPDATE_CURRENT);

        builder.setContentIntent(pending);

        manager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        manager.notify(notificationID, builder.build());
    }

    public void clickToCancel(View view) {
        cancelNotification();
    }

    private void cancelNotification() {
        manager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        manager.cancel(notificationID);
    }

    public void clickToUpdate(View view) {
        updateNotification();
    }

    private void updateNotification() {
        NotificationCompat.Builder builder = new NotificationCompat.Builder(
                this
        );

        builder.setContentTitle("Update Message");
        builder.setContentText("Nofication Demo: message has updated");
        builder.setTicker("Message Updated");
        builder.setSmallIcon(R.drawable.ic_action_unread);
        builder.setNumber(++numMsg);

        Intent intent = new Intent(this, NotificationActivity.class);

        TaskStackBuilder stack = TaskStackBuilder.create(this);
        stack.addParentStack(NotificationActivity.class);
        stack.addNextIntent(intent);

        PendingIntent pending = stack.getPendingIntent(0,
                PendingIntent.FLAG_UPDATE_CURRENT);

        builder.setContentIntent(pending);

        manager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        manager.notify(notificationID, builder.build());
    }

    public void clickToMultiple(View view) {
        displayMultiNotification();
    }

    private void displayMultiNotification() {
        NotificationCompat.Builder builder = new NotificationCompat.Builder(
                this
        );

        builder.setContentTitle("New Message");
        builder.setContentText("Nofication Demo: message has received");
        builder.setTicker("Message Alert");
        builder.setSmallIcon(R.drawable.ic_action_unread);
        builder.setNumber(++numMsg);

        NotificationCompat.InboxStyle inbox = new NotificationCompat.InboxStyle();
        String[] events = {"Msg 1", "Msg 2", "Msg 3"};
        inbox.setBigContentTitle("Big Title Details: ");
        for(int i = 0; i < events.length; i++){
            inbox.addLine(events[i]);
        }
        builder.setStyle(inbox);


        Intent intent = new Intent(this, NotificationActivity.class);

        TaskStackBuilder stack = TaskStackBuilder.create(this);
        stack.addParentStack(NotificationActivity.class);
        stack.addNextIntent(intent);

        PendingIntent pending = stack.getPendingIntent(0,
                PendingIntent.FLAG_UPDATE_CURRENT);

        builder.setContentIntent(pending);

        manager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        manager.notify(notificationID, builder.build());
    }
}