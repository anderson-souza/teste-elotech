
package com.elotech.model.profissional.page;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "sort", "pageSize", "pageNumber", "offset", "paged", "unpaged" })
public class Pageable {

	@JsonProperty("sort")
	private Sort sort;
	@JsonProperty("pageSize")
	private Integer pageSize;
	@JsonProperty("pageNumber")
	private Integer pageNumber;
	@JsonProperty("offset")
	private Integer offset;
	@JsonProperty("paged")
	private Boolean paged;
	@JsonProperty("unpaged")
	private Boolean unpaged;

	@JsonProperty("sort")
	public Sort getSort() {
		return sort;
	}

	@JsonProperty("sort")
	public void setSort(Sort sort) {
		this.sort = sort;
	}

	@JsonProperty("pageSize")
	public Integer getPageSize() {
		return pageSize;
	}

	@JsonProperty("pageSize")
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	@JsonProperty("pageNumber")
	public Integer getPageNumber() {
		return pageNumber;
	}

	@JsonProperty("pageNumber")
	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	@JsonProperty("offset")
	public Integer getOffset() {
		return offset;
	}

	@JsonProperty("offset")
	public void setOffset(Integer offset) {
		this.offset = offset;
	}

	@JsonProperty("paged")
	public Boolean getPaged() {
		return paged;
	}

	@JsonProperty("paged")
	public void setPaged(Boolean paged) {
		this.paged = paged;
	}

	@JsonProperty("unpaged")
	public Boolean getUnpaged() {
		return unpaged;
	}

	@JsonProperty("unpaged")
	public void setUnpaged(Boolean unpaged) {
		this.unpaged = unpaged;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("sort", sort).append("pageSize", pageSize)
				.append("pageNumber", pageNumber).append("offset", offset).append("paged", paged)
				.append("unpaged", unpaged).toString();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(paged).append(pageNumber).append(offset).append(pageSize).append(unpaged)
				.append(sort).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Pageable) == false) {
			return false;
		}
		Pageable rhs = ((Pageable) other);
		return new EqualsBuilder().append(paged, rhs.paged).append(pageNumber, rhs.pageNumber)
				.append(offset, rhs.offset).append(pageSize, rhs.pageSize).append(unpaged, rhs.unpaged)
				.append(sort, rhs.sort).isEquals();
	}

}
