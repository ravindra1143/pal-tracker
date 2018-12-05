package io.pivotal.pal.tracker;

import org.springframework.http.ResponseEntity;

import java.util.List;

public class InMemoryTimeEntryRepository implements TimeEntryRepository {

    @Override
    public TimeEntry create(TimeEntry any) {
        return null;
    }

    @Override
    public TimeEntry find(long timeEntryId) {
        return null;
    }

    @Override
    public ResponseEntity<List<TimeEntry>> list() {
        return null;
    }

    @Override
    public TimeEntry update(long eq, TimeEntry any) {
        return null;
    }

    @Override
    public ResponseEntity<TimeEntry> delete(long timeEntryId) {
        return null;
    }
}
