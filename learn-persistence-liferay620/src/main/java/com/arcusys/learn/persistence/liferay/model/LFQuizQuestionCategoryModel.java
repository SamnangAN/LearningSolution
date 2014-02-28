package com.arcusys.learn.persistence.liferay.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the LFQuizQuestionCategory service. Represents a row in the &quot;Learn_LFQuizQuestionCategory&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.arcusys.learn.persistence.liferay.model.impl.LFQuizQuestionCategoryModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.arcusys.learn.persistence.liferay.model.impl.LFQuizQuestionCategoryImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LFQuizQuestionCategory
 * @see com.arcusys.learn.persistence.liferay.model.impl.LFQuizQuestionCategoryImpl
 * @see com.arcusys.learn.persistence.liferay.model.impl.LFQuizQuestionCategoryModelImpl
 * @generated
 */
public interface LFQuizQuestionCategoryModel extends BaseModel<LFQuizQuestionCategory> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a l f quiz question category model instance should use the {@link LFQuizQuestionCategory} interface instead.
     */

    /**
     * Returns the primary key of this l f quiz question category.
     *
     * @return the primary key of this l f quiz question category
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this l f quiz question category.
     *
     * @param primaryKey the primary key of this l f quiz question category
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the ID of this l f quiz question category.
     *
     * @return the ID of this l f quiz question category
     */
    public long getId();

    /**
     * Sets the ID of this l f quiz question category.
     *
     * @param id the ID of this l f quiz question category
     */
    public void setId(long id);

    /**
     * Returns the title of this l f quiz question category.
     *
     * @return the title of this l f quiz question category
     */
    @AutoEscape
    public String getTitle();

    /**
     * Sets the title of this l f quiz question category.
     *
     * @param title the title of this l f quiz question category
     */
    public void setTitle(String title);

    /**
     * Returns the description of this l f quiz question category.
     *
     * @return the description of this l f quiz question category
     */
    @AutoEscape
    public String getDescription();

    /**
     * Sets the description of this l f quiz question category.
     *
     * @param description the description of this l f quiz question category
     */
    public void setDescription(String description);

    /**
     * Returns the quiz ID of this l f quiz question category.
     *
     * @return the quiz ID of this l f quiz question category
     */
    public Integer getQuizId();

    /**
     * Sets the quiz ID of this l f quiz question category.
     *
     * @param quizId the quiz ID of this l f quiz question category
     */
    public void setQuizId(Integer quizId);

    /**
     * Returns the parent ID of this l f quiz question category.
     *
     * @return the parent ID of this l f quiz question category
     */
    public Integer getParentId();

    /**
     * Sets the parent ID of this l f quiz question category.
     *
     * @param parentId the parent ID of this l f quiz question category
     */
    public void setParentId(Integer parentId);

    /**
     * Returns the arrangement index of this l f quiz question category.
     *
     * @return the arrangement index of this l f quiz question category
     */
    public Integer getArrangementIndex();

    /**
     * Sets the arrangement index of this l f quiz question category.
     *
     * @param arrangementIndex the arrangement index of this l f quiz question category
     */
    public void setArrangementIndex(Integer arrangementIndex);

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
    public int compareTo(LFQuizQuestionCategory lfQuizQuestionCategory);

    @Override
    public int hashCode();

    @Override
    public CacheModel<LFQuizQuestionCategory> toCacheModel();

    @Override
    public LFQuizQuestionCategory toEscapedModel();

    @Override
    public LFQuizQuestionCategory toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}