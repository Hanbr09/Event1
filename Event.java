import java.util.ArrayList;
import java.util.List;

public class Event {
    private String eventID;
    private String eventName;
    private String eventVenue;
    private String eventDate;
    private List<String> attendees;

    // Constructor
    public Event(String eventID, String eventName, String eventVenue, String eventDate) {
        this.eventID = eventID;
        this.eventName = eventName;
        this.eventVenue = eventVenue;
        this.eventDate = eventDate;
        this.attendees = new ArrayList<>();
    }

    // Getter and Setter methods
    public String getEventID() {
        return eventID;
    }

    public void setEventID(String eventID) {
        this.eventID = eventID;
    }

    public String getEventName() {
        return eventName;
    }
