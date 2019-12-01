
package com.elotech.model.profissional.page;

import java.util.List;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "content", "pageable", "totalPages", "totalElements", "last", "number", "size", "numberOfElements",
		"sort", "first", "empty" })
public class ProfissionalPage {

	@JsonProperty("content")
	private List<Content> content = null;
	@JsonProperty("pageable")
	private Pageable pageable;
	@JsonProperty("totalPages")
	private Integer totalPages;
	@JsonProperty("totalElements")
	private Integer totalElements;
	@JsonProperty("last")
	private Boolean last;
	@JsonProperty("number")
	private Integer number;
	@JsonProperty("size")
	private Integer size;
	@JsonProperty("numberOfElements")
	private Integer numberOfElements;
	@JsonProperty("sort")
	private Sort sort;
	@JsonProperty("first")
	private Boolean first;
	@JsonProperty("empty")
	private Boolean empty;

	@JsonProperty("content")
	public List<Content> getContent() {
		return content;
	}

	@JsonProperty("content")
	public void setContent(List<Content> content) {
		this.content = content;
	}

	@JsonProperty("pageable")
	public Pageable getPageable() {
		return pageable;
	}

	@JsonProperty("pageable")
	public void setPageable(Pageable pageable) {
		this.pageable = pageable;
	}

	@JsonProperty("totalPages")
	public Integer getTotalPages() {
		return totalPages;
	}

	@JsonProperty("totalPages")
	public void setTotalPages(Integer totalPages) {
		this.totalPages = totalPages;
	}

	@JsonProperty("totalElements")
	public Integer getTotalElements() {
		return totalElements;
	}

	@JsonProperty("totalElements")
	public void setTotalElements(Integer totalElements) {
		this.totalElements = totalElements;
	}

	@JsonProperty("last")
	public Boolean getLast() {
		return last;
	}

	@JsonProperty("last")
	public void setLast(Boolean last) {
		this.last = last;
	}

	@JsonProperty("number")
	public Integer getNumber() {
		return number;
	}

	@JsonProperty("number")
	public void setNumber(Integer number) {
		this.number = number;
	}

	@JsonProperty("size")
	public Integer getSize() {
		return size;
	}

	@JsonProperty("size")
	public void setSize(Integer size) {
		this.size = size;
	}

	@JsonProperty("numberOfElements")
	public Integer getNumberOfElements() {
		return numberOfElements;
	}

	@JsonProperty("numberOfElements")
	public void setNumberOfElements(Integer numberOfElements) {
		this.numberOfElements = numberOfElements;
	}

	@JsonProperty("sort")
	public Sort getSort() {
		return sort;
	}

	@JsonProperty("sort")
	public void setSort(Sort sort) {
		this.sort = sort;
	}

	@JsonProperty("first")
	public Boolean getFirst() {
		return first;
	}

	@JsonProperty("first")
	public void setFirst(Boolean first) {
		this.first = first;
	}

	@JsonProperty("empty")
	public Boolean getEmpty() {
		return empty;
	}

	@JsonProperty("empty")
	public void setEmpty(Boolean empty) {
		this.empty = empty;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("content", content).append("pageable", pageable)
				.append("totalPages", totalPages).append("totalElements", totalElements).append("last", last)
				.append("number", number).append("size", size).append("numberOfElements", numberOfElements)
				.append("sort", sort).append("first", first).append("empty", empty).toString();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(number).append(last).append(size).append(numberOfElements)
				.append(totalPages).append(pageable).append(sort).append(content).append(first).append(totalElements)
				.append(empty).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof ProfissionalPage) == false) {
			return false;
		}
		ProfissionalPage rhs = ((ProfissionalPage) other);
		return new EqualsBuilder().append(number, rhs.number).append(last, rhs.last).append(size, rhs.size)
				.append(numberOfElements, rhs.numberOfElements).append(totalPages, rhs.totalPages)
				.append(pageable, rhs.pageable).append(sort, rhs.sort).append(content, rhs.content)
				.append(first, rhs.first).append(totalElements, rhs.totalElements).append(empty, rhs.empty).isEquals();
	}

}
