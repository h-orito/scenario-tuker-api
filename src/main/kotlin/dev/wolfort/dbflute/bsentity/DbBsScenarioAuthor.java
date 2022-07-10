package dev.wolfort.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.Entity;
import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.dbflute.optional.OptionalEntity;
import dev.wolfort.dbflute.allcommon.DbEntityDefinedCommonColumn;
import dev.wolfort.dbflute.allcommon.DbDBMetaInstanceHandler;
import dev.wolfort.dbflute.exentity.*;

/**
 * The entity of SCENARIO_AUTHOR as TABLE. <br>
 * <pre>
 * [primary-key]
 *     scenario_author_id
 *
 * [column]
 *     scenario_author_id, scenario_id, author_id, register_datetime, register_trace, update_datetime, update_trace
 *
 * [sequence]
 *     
 *
 * [identity]
 *     scenario_author_id
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     AUTHOR, SCENARIO
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     author, scenario
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer scenarioAuthorId = entity.getScenarioAuthorId();
 * Integer scenarioId = entity.getScenarioId();
 * Integer authorId = entity.getAuthorId();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String registerTrace = entity.getRegisterTrace();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * String updateTrace = entity.getUpdateTrace();
 * entity.setScenarioAuthorId(scenarioAuthorId);
 * entity.setScenarioId(scenarioId);
 * entity.setAuthorId(authorId);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setRegisterTrace(registerTrace);
 * entity.setUpdateDatetime(updateDatetime);
 * entity.setUpdateTrace(updateTrace);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class DbBsScenarioAuthor extends AbstractEntity implements DomainEntity, DbEntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** scenario_author_id: {PK, ID, NotNull, INT UNSIGNED(10)} */
    protected Integer _scenarioAuthorId;

    /** scenario_id: {UQ+, NotNull, INT UNSIGNED(10), FK to scenario} */
    protected Integer _scenarioId;

    /** author_id: {+UQ, IX, NotNull, INT UNSIGNED(10), FK to author} */
    protected Integer _authorId;

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
        return "scenario_author";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_scenarioAuthorId == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param scenarioId : UQ+, NotNull, INT UNSIGNED(10), FK to scenario. (NotNull)
     * @param authorId : +UQ, IX, NotNull, INT UNSIGNED(10), FK to author. (NotNull)
     */
    public void uniqueBy(Integer scenarioId, Integer authorId) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("scenarioId");
        __uniqueDrivenProperties.addPropertyName("authorId");
        setScenarioId(scenarioId);setAuthorId(authorId);
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** AUTHOR by my author_id, named 'author'. */
    protected OptionalEntity<DbAuthor> _author;

    /**
     * [get] AUTHOR by my author_id, named 'author'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'author'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<DbAuthor> getAuthor() {
        if (_author == null) { _author = OptionalEntity.relationEmpty(this, "author"); }
        return _author;
    }

    /**
     * [set] AUTHOR by my author_id, named 'author'.
     * @param author The entity of foreign property 'author'. (NullAllowed)
     */
    public void setAuthor(OptionalEntity<DbAuthor> author) {
        _author = author;
    }

    /** SCENARIO by my scenario_id, named 'scenario'. */
    protected OptionalEntity<DbScenario> _scenario;

    /**
     * [get] SCENARIO by my scenario_id, named 'scenario'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'scenario'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<DbScenario> getScenario() {
        if (_scenario == null) { _scenario = OptionalEntity.relationEmpty(this, "scenario"); }
        return _scenario;
    }

    /**
     * [set] SCENARIO by my scenario_id, named 'scenario'.
     * @param scenario The entity of foreign property 'scenario'. (NullAllowed)
     */
    public void setScenario(OptionalEntity<DbScenario> scenario) {
        _scenario = scenario;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof DbBsScenarioAuthor) {
            DbBsScenarioAuthor other = (DbBsScenarioAuthor)obj;
            if (!xSV(_scenarioAuthorId, other._scenarioAuthorId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _scenarioAuthorId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_author != null && _author.isPresent())
        { sb.append(li).append(xbRDS(_author, "author")); }
        if (_scenario != null && _scenario.isPresent())
        { sb.append(li).append(xbRDS(_scenario, "scenario")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_scenarioAuthorId));
        sb.append(dm).append(xfND(_scenarioId));
        sb.append(dm).append(xfND(_authorId));
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
        if (_author != null && _author.isPresent())
        { sb.append(dm).append("author"); }
        if (_scenario != null && _scenario.isPresent())
        { sb.append(dm).append("scenario"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public DbScenarioAuthor clone() {
        return (DbScenarioAuthor)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] scenario_author_id: {PK, ID, NotNull, INT UNSIGNED(10)} <br>
     * @return The value of the column 'scenario_author_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getScenarioAuthorId() {
        checkSpecifiedProperty("scenarioAuthorId");
        return _scenarioAuthorId;
    }

    /**
     * [set] scenario_author_id: {PK, ID, NotNull, INT UNSIGNED(10)} <br>
     * @param scenarioAuthorId The value of the column 'scenario_author_id'. (basically NotNull if update: for the constraint)
     */
    public void setScenarioAuthorId(Integer scenarioAuthorId) {
        registerModifiedProperty("scenarioAuthorId");
        _scenarioAuthorId = scenarioAuthorId;
    }

    /**
     * [get] scenario_id: {UQ+, NotNull, INT UNSIGNED(10), FK to scenario} <br>
     * @return The value of the column 'scenario_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getScenarioId() {
        checkSpecifiedProperty("scenarioId");
        return _scenarioId;
    }

    /**
     * [set] scenario_id: {UQ+, NotNull, INT UNSIGNED(10), FK to scenario} <br>
     * @param scenarioId The value of the column 'scenario_id'. (basically NotNull if update: for the constraint)
     */
    public void setScenarioId(Integer scenarioId) {
        registerModifiedProperty("scenarioId");
        _scenarioId = scenarioId;
    }

    /**
     * [get] author_id: {+UQ, IX, NotNull, INT UNSIGNED(10), FK to author} <br>
     * @return The value of the column 'author_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getAuthorId() {
        checkSpecifiedProperty("authorId");
        return _authorId;
    }

    /**
     * [set] author_id: {+UQ, IX, NotNull, INT UNSIGNED(10), FK to author} <br>
     * @param authorId The value of the column 'author_id'. (basically NotNull if update: for the constraint)
     */
    public void setAuthorId(Integer authorId) {
        registerModifiedProperty("authorId");
        _authorId = authorId;
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
