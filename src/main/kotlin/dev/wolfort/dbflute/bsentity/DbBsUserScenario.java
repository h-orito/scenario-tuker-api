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
 * The entity of USER_SCENARIO as TABLE. <br>
 * <pre>
 * [primary-key]
 *     user_scenario_id
 *
 * [column]
 *     user_scenario_id, user_id, scenario_id, register_datetime, register_trace, update_datetime, update_trace
 *
 * [sequence]
 *     
 *
 * [identity]
 *     user_scenario_id
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     SCENARIO, USER
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     scenario, user
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer userScenarioId = entity.getUserScenarioId();
 * Integer userId = entity.getUserId();
 * Integer scenarioId = entity.getScenarioId();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String registerTrace = entity.getRegisterTrace();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * String updateTrace = entity.getUpdateTrace();
 * entity.setUserScenarioId(userScenarioId);
 * entity.setUserId(userId);
 * entity.setScenarioId(scenarioId);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setRegisterTrace(registerTrace);
 * entity.setUpdateDatetime(updateDatetime);
 * entity.setUpdateTrace(updateTrace);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class DbBsUserScenario extends AbstractEntity implements DomainEntity, DbEntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** user_scenario_id: {PK, ID, NotNull, INT UNSIGNED(10)} */
    protected Integer _userScenarioId;

    /** user_id: {UQ+, NotNull, INT UNSIGNED(10), FK to user} */
    protected Integer _userId;

    /** scenario_id: {+UQ, IX, NotNull, INT UNSIGNED(10), FK to scenario} */
    protected Integer _scenarioId;

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
        return "user_scenario";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_userScenarioId == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param userId : UQ+, NotNull, INT UNSIGNED(10), FK to user. (NotNull)
     * @param scenarioId : +UQ, IX, NotNull, INT UNSIGNED(10), FK to scenario. (NotNull)
     */
    public void uniqueBy(Integer userId, Integer scenarioId) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("userId");
        __uniqueDrivenProperties.addPropertyName("scenarioId");
        setUserId(userId);setScenarioId(scenarioId);
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
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

    /** USER by my user_id, named 'user'. */
    protected OptionalEntity<DbUser> _user;

    /**
     * [get] USER by my user_id, named 'user'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'user'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<DbUser> getUser() {
        if (_user == null) { _user = OptionalEntity.relationEmpty(this, "user"); }
        return _user;
    }

    /**
     * [set] USER by my user_id, named 'user'.
     * @param user The entity of foreign property 'user'. (NullAllowed)
     */
    public void setUser(OptionalEntity<DbUser> user) {
        _user = user;
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
        if (obj instanceof DbBsUserScenario) {
            DbBsUserScenario other = (DbBsUserScenario)obj;
            if (!xSV(_userScenarioId, other._userScenarioId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _userScenarioId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_scenario != null && _scenario.isPresent())
        { sb.append(li).append(xbRDS(_scenario, "scenario")); }
        if (_user != null && _user.isPresent())
        { sb.append(li).append(xbRDS(_user, "user")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_userScenarioId));
        sb.append(dm).append(xfND(_userId));
        sb.append(dm).append(xfND(_scenarioId));
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
        if (_scenario != null && _scenario.isPresent())
        { sb.append(dm).append("scenario"); }
        if (_user != null && _user.isPresent())
        { sb.append(dm).append("user"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public DbUserScenario clone() {
        return (DbUserScenario)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] user_scenario_id: {PK, ID, NotNull, INT UNSIGNED(10)} <br>
     * @return The value of the column 'user_scenario_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getUserScenarioId() {
        checkSpecifiedProperty("userScenarioId");
        return _userScenarioId;
    }

    /**
     * [set] user_scenario_id: {PK, ID, NotNull, INT UNSIGNED(10)} <br>
     * @param userScenarioId The value of the column 'user_scenario_id'. (basically NotNull if update: for the constraint)
     */
    public void setUserScenarioId(Integer userScenarioId) {
        registerModifiedProperty("userScenarioId");
        _userScenarioId = userScenarioId;
    }

    /**
     * [get] user_id: {UQ+, NotNull, INT UNSIGNED(10), FK to user} <br>
     * @return The value of the column 'user_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getUserId() {
        checkSpecifiedProperty("userId");
        return _userId;
    }

    /**
     * [set] user_id: {UQ+, NotNull, INT UNSIGNED(10), FK to user} <br>
     * @param userId The value of the column 'user_id'. (basically NotNull if update: for the constraint)
     */
    public void setUserId(Integer userId) {
        registerModifiedProperty("userId");
        _userId = userId;
    }

    /**
     * [get] scenario_id: {+UQ, IX, NotNull, INT UNSIGNED(10), FK to scenario} <br>
     * @return The value of the column 'scenario_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getScenarioId() {
        checkSpecifiedProperty("scenarioId");
        return _scenarioId;
    }

    /**
     * [set] scenario_id: {+UQ, IX, NotNull, INT UNSIGNED(10), FK to scenario} <br>
     * @param scenarioId The value of the column 'scenario_id'. (basically NotNull if update: for the constraint)
     */
    public void setScenarioId(Integer scenarioId) {
        registerModifiedProperty("scenarioId");
        _scenarioId = scenarioId;
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
