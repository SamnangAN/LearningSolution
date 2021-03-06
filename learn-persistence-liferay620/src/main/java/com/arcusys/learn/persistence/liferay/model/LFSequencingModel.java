package com.arcusys.learn.persistence.liferay.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the LFSequencing service. Represents a row in the &quot;Learn_LFSequencing&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.arcusys.learn.persistence.liferay.model.impl.LFSequencingModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.arcusys.learn.persistence.liferay.model.impl.LFSequencingImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LFSequencing
 * @see com.arcusys.learn.persistence.liferay.model.impl.LFSequencingImpl
 * @see com.arcusys.learn.persistence.liferay.model.impl.LFSequencingModelImpl
 * @generated
 */
public interface LFSequencingModel extends BaseModel<LFSequencing> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a l f sequencing model instance should use the {@link LFSequencing} interface instead.
     */

    /**
     * Returns the primary key of this l f sequencing.
     *
     * @return the primary key of this l f sequencing
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this l f sequencing.
     *
     * @param primaryKey the primary key of this l f sequencing
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the ID of this l f sequencing.
     *
     * @return the ID of this l f sequencing
     */
    public long getId();

    /**
     * Sets the ID of this l f sequencing.
     *
     * @param id the ID of this l f sequencing
     */
    public void setId(long id);

    /**
     * Returns the package i d of this l f sequencing.
     *
     * @return the package i d of this l f sequencing
     */
    public Integer getPackageID();

    /**
     * Sets the package i d of this l f sequencing.
     *
     * @param packageID the package i d of this l f sequencing
     */
    public void setPackageID(Integer packageID);

    /**
     * Returns the activity i d of this l f sequencing.
     *
     * @return the activity i d of this l f sequencing
     */
    @AutoEscape
    public String getActivityID();

    /**
     * Sets the activity i d of this l f sequencing.
     *
     * @param activityID the activity i d of this l f sequencing
     */
    public void setActivityID(String activityID);

    /**
     * Returns the shared ID of this l f sequencing.
     *
     * @return the shared ID of this l f sequencing
     */
    @AutoEscape
    public String getSharedId();

    /**
     * Sets the shared ID of this l f sequencing.
     *
     * @param sharedId the shared ID of this l f sequencing
     */
    public void setSharedId(String sharedId);

    /**
     * Returns the shared sequencing ID reference of this l f sequencing.
     *
     * @return the shared sequencing ID reference of this l f sequencing
     */
    @AutoEscape
    public String getSharedSequencingIdReference();

    /**
     * Sets the shared sequencing ID reference of this l f sequencing.
     *
     * @param sharedSequencingIdReference the shared sequencing ID reference of this l f sequencing
     */
    public void setSharedSequencingIdReference(
        String sharedSequencingIdReference);

    /**
     * Returns the c attempt objective progress child of this l f sequencing.
     *
     * @return the c attempt objective progress child of this l f sequencing
     */
    public boolean getCAttemptObjectiveProgressChild();

    /**
     * Returns <code>true</code> if this l f sequencing is c attempt objective progress child.
     *
     * @return <code>true</code> if this l f sequencing is c attempt objective progress child; <code>false</code> otherwise
     */
    public boolean isCAttemptObjectiveProgressChild();

    /**
     * Sets whether this l f sequencing is c attempt objective progress child.
     *
     * @param cAttemptObjectiveProgressChild the c attempt objective progress child of this l f sequencing
     */
    public void setCAttemptObjectiveProgressChild(
        boolean cAttemptObjectiveProgressChild);

    /**
     * Returns the c attempt attempt progress child of this l f sequencing.
     *
     * @return the c attempt attempt progress child of this l f sequencing
     */
    public boolean getCAttemptAttemptProgressChild();

    /**
     * Returns <code>true</code> if this l f sequencing is c attempt attempt progress child.
     *
     * @return <code>true</code> if this l f sequencing is c attempt attempt progress child; <code>false</code> otherwise
     */
    public boolean isCAttemptAttemptProgressChild();

    /**
     * Sets whether this l f sequencing is c attempt attempt progress child.
     *
     * @param cAttemptAttemptProgressChild the c attempt attempt progress child of this l f sequencing
     */
    public void setCAttemptAttemptProgressChild(
        boolean cAttemptAttemptProgressChild);

    /**
     * Returns the attempt limit of this l f sequencing.
     *
     * @return the attempt limit of this l f sequencing
     */
    public Integer getAttemptLimit();

    /**
     * Sets the attempt limit of this l f sequencing.
     *
     * @param attemptLimit the attempt limit of this l f sequencing
     */
    public void setAttemptLimit(Integer attemptLimit);

    /**
     * Returns the duration limit in milliseconds of this l f sequencing.
     *
     * @return the duration limit in milliseconds of this l f sequencing
     */
    public Long getDurationLimitInMilliseconds();

    /**
     * Sets the duration limit in milliseconds of this l f sequencing.
     *
     * @param durationLimitInMilliseconds the duration limit in milliseconds of this l f sequencing
     */
    public void setDurationLimitInMilliseconds(Long durationLimitInMilliseconds);

    /**
     * Returns the rollup contribution i d of this l f sequencing.
     *
     * @return the rollup contribution i d of this l f sequencing
     */
    public Integer getRollupContributionID();

    /**
     * Sets the rollup contribution i d of this l f sequencing.
     *
     * @param rollupContributionID the rollup contribution i d of this l f sequencing
     */
    public void setRollupContributionID(Integer rollupContributionID);

    /**
     * Returns the prevent children activation of this l f sequencing.
     *
     * @return the prevent children activation of this l f sequencing
     */
    public boolean getPreventChildrenActivation();

    /**
     * Returns <code>true</code> if this l f sequencing is prevent children activation.
     *
     * @return <code>true</code> if this l f sequencing is prevent children activation; <code>false</code> otherwise
     */
    public boolean isPreventChildrenActivation();

    /**
     * Sets whether this l f sequencing is prevent children activation.
     *
     * @param preventChildrenActivation the prevent children activation of this l f sequencing
     */
    public void setPreventChildrenActivation(boolean preventChildrenActivation);

    /**
     * Returns the constrain choice of this l f sequencing.
     *
     * @return the constrain choice of this l f sequencing
     */
    public boolean getConstrainChoice();

    /**
     * Returns <code>true</code> if this l f sequencing is constrain choice.
     *
     * @return <code>true</code> if this l f sequencing is constrain choice; <code>false</code> otherwise
     */
    public boolean isConstrainChoice();

    /**
     * Sets whether this l f sequencing is constrain choice.
     *
     * @param constrainChoice the constrain choice of this l f sequencing
     */
    public void setConstrainChoice(boolean constrainChoice);

    @Override
    public boolean isNew();

    @Override
    public void setNew(boolean n);

    @Override
    public boolean isCachedModel();

    @Override
    public void setCachedModel(boolean cachedModel);

    @Override
    public boolean isEscapedModel();

    @Override
    public Serializable getPrimaryKeyObj();

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj);

    @Override
    public ExpandoBridge getExpandoBridge();

    @Override
    public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

    @Override
    public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext);

    @Override
    public Object clone();

    @Override
    public int compareTo(LFSequencing lfSequencing);

    @Override
    public int hashCode();

    @Override
    public CacheModel<LFSequencing> toCacheModel();

    @Override
    public LFSequencing toEscapedModel();

    @Override
    public LFSequencing toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}
