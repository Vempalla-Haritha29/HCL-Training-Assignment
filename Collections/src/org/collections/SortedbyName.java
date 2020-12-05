package org.collections;

import java.util.Comparator;

public class SortedbyName implements Comparator<UserName> {
	public int compare(UserName a, UserName b) {
		return -a.getName().compareTo(b.getName());

	}

}
