package it.italiangrid.portal.fluka.db.domain;

// Generated 26-mar-2013 11.36.50 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * JobParametersId generated by hbm2java
 */
@Embeddable
public class JobParametersId implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7162281603024557289L;
	private int jobId;
	private String name;

	public JobParametersId() {
	}

	public JobParametersId(int jobId, String name) {
		this.jobId = jobId;
		this.name = name;
	}

	@Column(name = "JobID", nullable = false)
	public int getJobId() {
		return this.jobId;
	}

	public void setJobId(int jobId) {
		this.jobId = jobId;
	}

	@Column(name = "Name", nullable = false, length = 100)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof JobParametersId))
			return false;
		JobParametersId castOther = (JobParametersId) other;

		return (this.getJobId() == castOther.getJobId())
				&& ((this.getName() == castOther.getName()) || (this.getName() != null
						&& castOther.getName() != null && this.getName()
						.equals(castOther.getName())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getJobId();
		result = 37 * result
				+ (getName() == null ? 0 : this.getName().hashCode());
		return result;
	}

}