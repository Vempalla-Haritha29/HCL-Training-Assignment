package org.collections;

import java.util.Comparator;

class SortedbyEmail implements Comparator<UserName> {
	public int compare(UserName a, UserName b) {
		return -a.getEmail().compareTo(b.getEmail());

	}

}