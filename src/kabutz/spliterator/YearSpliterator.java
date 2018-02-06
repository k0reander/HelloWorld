package kabutz.spliterator;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.Objects;
import java.util.Spliterator;
import java.util.function.*;

public class YearSpliterator implements Spliterator<LocalDate> {
	
	private LocalDate date;
	
	public YearSpliterator(LocalDate startDate) {
		this.date = startDate;
	}
	
	public long estimateSize() {
		return Long.MAX_VALUE;
	}
	
	public boolean tryAdvance(Consumer<? super LocalDate> action) {
		Objects.requireNonNull(action);
		action.accept(date);
		date = date.minusYears(1);
		return true;
	}
	
	public Spliterator<LocalDate> trySplit() {
		return null;
	}
	
	public int characteristics() {
		return DISTINCT | IMMUTABLE | NONNULL | ORDERED | SORTED;
	}
	
	public Comparator<? super LocalDate> getComparator() {
		return Comparator.reverseOrder();
	}
}
