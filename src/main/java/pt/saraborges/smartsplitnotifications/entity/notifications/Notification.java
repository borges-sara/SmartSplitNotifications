package pt.saraborges.smartsplitnotifications.entity.notifications;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import pt.saraborges.smartsplitnotifications.entity.users.User;
import java.time.Instant;
import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Notification {
    @Id
    private UUID id;

    @ManyToOne
    private User recipient;

    private NotificationType type;

    private String subject;

    private String content;

    private NotificationChannel channel;

    private NotificationStatus status;

    private UUID sourceEventId;

    private UUID relatedEntityId;

    private Instant createdAt;
    private Instant sentAt;
    private int retryCount;

    private String failureReason;
}
