
package com.elotech.model.profissional.page;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "sorted", "unsorted", "empty" })
public class Sort {

	@JsonProperty("sorted")
	private Boolean sorted;
	@JsonProperty("unsorted")
	private Boolean unsorted;
	@JsonProperty("empty")
	private Boolean empty;

	@JsonProperty("sorted")
	public Boolean getSorted() {
		return sorted;
	}

	@JsonProperty("sorted")
	public void setSorted(Boolean sorted) {
		this.sorted = sorted;
	}

	@JsonProperty("unsorted")
	public Boolean getUnsorted() {
		return unsorted;
	}

	@JsonProperty("unsorted")
	public void setUnsorted(Boolean unsorted) {
		this.unsorted = unsorted;
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
		return new ToStringBuilder(this).append("sorted", sorted).append("unsorted", unsorted).append("empty", empty)
				.toString();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(unsorted).append(sorted).append(empty).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Sort) == false) {
			return false;
		}
		Sort rhs = ((Sort) other);
		return new EqualsBuilder().append(unsorted, rhs.unsorted).append(sorted, rhs.sorted).append(empty, rhs.empty)
				.isEquals();
	}

}
