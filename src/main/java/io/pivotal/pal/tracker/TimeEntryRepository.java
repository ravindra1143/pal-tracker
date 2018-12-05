package io.pivotal.pal.tracker;

import org.springframework.http.ResponseEntity;

import java.util.List;

import io.pivotal.pal.tracker.TimeEntry;

public interface TimeEntryRepository {

    public TimeEntry create(TimeEntry any );

    public TimeEntry find(long timeEntryId);

    public ResponseEntity<List<TimeEntry>> list();

    public TimeEntry update(long eq, TimeEntry any) ;

    public ResponseEntity<TimeEntry> delete(long timeEntryId);
}
