package com.connectin.domain.post;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.connectin.common.domain.Category;
import com.connectin.constants.Visibility;
import com.connectin.domain.like.LikeDTO;
import com.connectin.domain.post.comments.CommentDTO;
import com.connectin.domain.user.UserDTO;

public class PostDTO implements Serializable{
	@Override
	public String toString() {
		return "PostDTO [id=" + id + ", category=" + category + ", visibility=" + visibility + ", tags=" + tags
				+ ", comments=" + comments + ", creadteDate=" + creadteDate + ", likes=" + likes + "]";
	}
	public PostDTO(int id, String category, Visibility visibility, String tags, Date creadteDate) {
		super();
		this.id = id;
		this.category = category;
		this.visibility = visibility;
		this.tags = tags;
		this.creadteDate = creadteDate;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((category == null) ? 0 : category.hashCode());
		result = prime * result + ((comments == null) ? 0 : comments.hashCode());
		result = prime * result + ((creadteDate == null) ? 0 : creadteDate.hashCode());
		result = prime * result + id;
		result = prime * result + ((likes == null) ? 0 : likes.hashCode());
		result = prime * result + ((tags == null) ? 0 : tags.hashCode());
		result = prime * result + ((visibility == null) ? 0 : visibility.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PostDTO other = (PostDTO) obj;
		if (category == null) {
			if (other.category != null)
				return false;
		} else if (!category.equals(other.category))
			return false;
		if (comments == null) {
			if (other.comments != null)
				return false;
		} else if (!comments.equals(other.comments))
			return false;
		if (creadteDate == null) {
			if (other.creadteDate != null)
				return false;
		} else if (!creadteDate.equals(other.creadteDate))
			return false;
		if (id != other.id)
			return false;
		if (likes == null) {
			if (other.likes != null)
				return false;
		} else if (!likes.equals(other.likes))
			return false;
		if (tags == null) {
			if (other.tags != null)
				return false;
		} else if (!tags.equals(other.tags))
			return false;
		if (visibility != other.visibility)
			return false;
		return true;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Visibility getVisibility() {
		return visibility;
	}
	public void setVisibility(Visibility visibility) {
		this.visibility = visibility;
	}
	public String getTags() {
		return tags;
	}
	public void setTags(String tags) {
		this.tags = tags;
	}
	public List<CommentDTO> getComments() {
		return comments;
	}
	public void setComments(List<CommentDTO> comments) {
		this.comments = comments;
	}
	public Date getCreadteDate() {
		return creadteDate;
	}
	public void setCreadteDate(Date creadteDate) {
		this.creadteDate = creadteDate;
	}
	public List<LikeDTO> getLikes() {
		return likes;
	}
	public void setLikes(List<LikeDTO> likes) {
		this.likes = likes;
	}
	private int id;
	private String category;
	private Visibility visibility;
	private String tags;
	private List<CommentDTO> comments;
	private Date creadteDate;
	private List<LikeDTO> likes;
	
}
