package pl.coreservices.bootcamp.jpa.model;

import javax.persistence.Entity;
;

/**
 * Created by BKuczynski on 2016-12-15.
 */
@Entity
public class AnonymousComment extends Comment{



	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	private String authorName;
}
