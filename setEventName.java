public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventVenue() {
        return eventVenue;
    }

    public void setEventVenue(String eventVenue) {
        this.eventVenue = eventVenue;
    }

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public List<String> getAttendees() {
        return attendees;
    }

    // Method to add an attendee
    public void addAttendee(String attendeeName) {
        attendees.add(attendeeName);
    }

    // Method to remove an attendee
    public void removeAttendee(String attendeeName) {
        attendees.remove(attendeeName);
    }

    // Method to display total attendees
    public void displayTotalAttendees() {
        System.out.println("Total attendees: " + attendees.size());
    }

    // Override toString() method for custom output
    @Override
    public String toString() {
        return "Event ID: " + eventID +
                "\nEvent Name: " + eventName +
                "\nVenue: " + eventVenue +
                "\nDate: " + eventDate +
                "\nAttendees: " + attendees;
    }
}
