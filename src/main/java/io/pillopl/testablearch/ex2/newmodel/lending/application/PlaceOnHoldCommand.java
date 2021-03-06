package io.pillopl.testablearch.ex2.newmodel.lending.application;

import io.pillopl.testablearch.ex2.newmodel.catalogue.BookId;
import io.pillopl.testablearch.ex2.newmodel.lending.domain.patron.HoldDuration;
import io.pillopl.testablearch.ex2.newmodel.lending.domain.patron.PatronId;
import lombok.NonNull;
import lombok.Value;

@Value
public class PlaceOnHoldCommand {

    @NonNull
    BookId bookId;
    @NonNull
    PatronId patronId;
    @NonNull
    HoldDuration holdDuration;
}
