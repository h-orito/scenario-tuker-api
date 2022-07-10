package dev.wolfort.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import dev.wolfort.dbflute.allcommon.DbEntityDefinedCommonColumn;
import dev.wolfort.dbflute.allcommon.DbDBMetaInstanceHandler;
import dev.wolfort.dbflute.exentity.*;

/**
 * The entity of AUTHOR as TABLE. <br>
 * <pre>
 * [primary-key]
 *     author_id
 *
 * [column]
 *     author_id, author_name, register_datetime, register_trace, update_datetime, update_trace
 *
 * [sequence]
 *     
 *
 * [identity]
 *     author_id
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     SCENARIO_AUTHOR
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     scenarioAuthorList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer authorId = entity.getAuthorId();
 * String authorName = entity.getAuthorName();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String registerTrace = entity.getRegisterTrace();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * String updateTrace = entity.getUpdateTrace();
 * entity.setAuthorId(authorId);
 * entity.setAuthorName(authorName);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setRegisterTrace(registerTrace);
 * entity.setUpdateDatetime(updateDatetime);
 * entity.setUpdateTrace(updateTrace);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class DbBsAuthor extends AbstractEntity implements DomainEntity, DbEntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** author_id: {PK, ID, NotNull, INT UNSIGNED(10)} */
    protected Integer _authorId;

    /** author_name: {NotNull, VARCHAR(100)} */
    protected String _authorName;

    /** register_datetime: {NotNull, DATETIME(19)} */
    protected java.time.LocalDateTime _registerDatetime;

    /** register_trace: {NotNull, VARCHAR(64)} */
    protected String _registerTrace;

    /** update_datetime: {NotNull, DATETIME(19)} */
    protected java.time.LocalDateTime _updateDatetime;

    /** update_trace: {NotNull, VARCHAR(64)} */
    protected String _updateTrace;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DbDBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "author";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_authorId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** SCENARIO_AUTHOR by author_id, named 'scenarioAuthorList'. */
    protected List<DbScenarioAuthor> _scenarioAuthorList;

    /**
     * [get] SCENARIO_AUTHOR by author_id, named 'scenarioAuthorList'.
     * @return The entity list of referrer property 'scenarioAuthorList'. (NotNull: even if no loading, returns empty list)
     */
    public List<DbScenarioAuthor> getScenarioAuthorList() {
        if (_scenarioAuthorList == null) { _scenarioAuthorList = newReferrerList(); }
        return _scenarioAuthorList;
    }

    /**
     * [set] SCENARIO_AUTHOR by author_id, named 'scenarioAuthorList'.
     * @param scenarioAuthorList The entity list of referrer property 'scenarioAuthorList'. (NullAllowed)
     */
    public void setScenarioAuthorList(List<DbScenarioAuthor> scenarioAuthorList) {
        _scenarioAuthorList = scenarioAuthorList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof DbBsAuthor) {
            DbBsAuthor other = (DbBsAuthor)obj;
            if (!xSV(_authorId, other._authorId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _authorId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_scenarioAuthorList != null) { for (DbScenarioAuthor et : _scenarioAuthorList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "scenarioAuthorList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_authorId));
        sb.append(dm).append(xfND(_authorName));
        sb.append(dm).append(xfND(_registerDatetime));
        sb.append(dm).append(xfND(_registerTrace));
        sb.append(dm).append(xfND(_updateDatetime));
        sb.append(dm).append(xfND(_updateTrace));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_scenarioAuthorList != null && !_scenarioAuthorList.isEmpty())
        { sb.append(dm).append("scenarioAuthorList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public DbAuthor clone() {
        return (DbAuthor)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] author_id: {PK, ID, NotNull, INT UNSIGNED(10)} <br>
     * @return The value of the column 'author_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getAuthorId() {
        checkSpecifiedProperty("authorId");
        return _authorId;
    }

    /**
     * [set] author_id: {PK, ID, NotNull, INT UNSIGNED(10)} <br>
     * @param authorId The value of the column 'author_id'. (basically NotNull if update: for the constraint)
     */
    public void setAuthorId(Integer authorId) {
        registerModifiedProperty("authorId");
        _authorId = authorId;
    }

    /**
     * [get] author_name: {NotNull, VARCHAR(100)} <br>
     * @return The value of the column 'author_name'. (basically NotNull if selected: for the constraint)
     */
    public String getAuthorName() {
        checkSpecifiedProperty("authorName");
        return convertEmptyToNull(_authorName);
    }

    /**
     * [set] author_name: {NotNull, VARCHAR(100)} <br>
     * @param authorName The value of the column 'author_name'. (basically NotNull if update: for the constraint)
     */
    public void setAuthorName(String authorName) {
        registerModifiedProperty("authorName");
        _authorName = authorName;
    }

    /**
     * [get] register_datetime: {NotNull, DATETIME(19)} <br>
     * @return The value of the column 'register_datetime'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getRegisterDatetime() {
        checkSpecifiedProperty("registerDatetime");
        return _registerDatetime;
    }

    /**
     * [set] register_datetime: {NotNull, DATETIME(19)} <br>
     * @param registerDatetime The value of the column 'register_datetime'. (basically NotNull if update: for the constraint)
     */
    public void setRegisterDatetime(java.time.LocalDateTime registerDatetime) {
        registerModifiedProperty("registerDatetime");
        _registerDatetime = registerDatetime;
    }

    /**
     * [get] register_trace: {NotNull, VARCHAR(64)} <br>
     * @return The value of the column 'register_trace'. (basically NotNull if selected: for the constraint)
     */
    public String getRegisterTrace() {
        checkSpecifiedProperty("registerTrace");
        return convertEmptyToNull(_registerTrace);
    }

    /**
     * [set] register_trace: {NotNull, VARCHAR(64)} <br>
     * @param registerTrace The value of the column 'register_trace'. (basically NotNull if update: for the constraint)
     */
    public void setRegisterTrace(String registerTrace) {
        registerModifiedProperty("registerTrace");
        _registerTrace = registerTrace;
    }

    /**
     * [get] update_datetime: {NotNull, DATETIME(19)} <br>
     * @return The value of the column 'update_datetime'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getUpdateDatetime() {
        checkSpecifiedProperty("updateDatetime");
        return _updateDatetime;
    }

    /**
     * [set] update_datetime: {NotNull, DATETIME(19)} <br>
     * @param updateDatetime The value of the column 'update_datetime'. (basically NotNull if update: for the constraint)
     */
    public void setUpdateDatetime(java.time.LocalDateTime updateDatetime) {
        registerModifiedProperty("updateDatetime");
        _updateDatetime = updateDatetime;
    }

    /**
     * [get] update_trace: {NotNull, VARCHAR(64)} <br>
     * @return The value of the column 'update_trace'. (basically NotNull if selected: for the constraint)
     */
    public String getUpdateTrace() {
        checkSpecifiedProperty("updateTrace");
        return convertEmptyToNull(_updateTrace);
    }

    /**
     * [set] update_trace: {NotNull, VARCHAR(64)} <br>
     * @param updateTrace The value of the column 'update_trace'. (basically NotNull if update: for the constraint)
     */
    public void setUpdateTrace(String updateTrace) {
        registerModifiedProperty("updateTrace");
        _updateTrace = updateTrace;
    }
}
