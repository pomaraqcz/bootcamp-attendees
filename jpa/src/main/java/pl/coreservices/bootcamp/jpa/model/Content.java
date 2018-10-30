package pl.coreservices.bootcamp.jpa.model;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * Created by BKuczynski on 2016-12-15.
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Content {

	@EmbeddedId
	ContentID contentId;
	private Author author;
    @OneToOne(mappedBy="Content")
	private LocalDateTime publishedAt;
    @OneToOne(mappedBy="Content")
    private String content;


	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public LocalDateTime getPublishedAt() {
		return publishedAt;
	}

	public void setPublishedAt(LocalDateTime publishedAt) {
		this.publishedAt = publishedAt;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}

@Embeddable
class ContentID{
	private Author author;

	private LocalDateTime publishedAt;

	private String content;

}