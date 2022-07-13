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
 * The entity of GAME_SYSTEM as TABLE. <br>
 * <pre>
 * [primary-key]
 *     game_system_id
 *
 * [column]
 *     game_system_id, game_system_name, register_datetime, register_trace, update_datetime, update_trace
 *
 * [sequence]
 *     
 *
 * [identity]
 *     game_system_id
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     RULE_BOOK, SCENARIO
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     ruleBookList, scenarioList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer gameSystemId = entity.getGameSystemId();
 * String gameSystemName = entity.getGameSystemName();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String registerTrace = entity.getRegisterTrace();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * String updateTrace = entity.getUpdateTrace();
 * entity.setGameSystemId(gameSystemId);
 * entity.setGameSystemName(gameSystemName);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setRegisterTrace(registerTrace);
 * entity.setUpdateDatetime(updateDatetime);
 * entity.setUpdateTrace(updateTrace);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class DbBsGameSystem extends AbstractEntity implements DomainEntity, DbEntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** game_system_id: {PK, ID, NotNull, INT UNSIGNED(10)} */
    protected Integer _gameSystemId;

    /** game_system_name: {NotNull, VARCHAR(255)} */
    protected String _gameSystemName;

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
        return "game_system";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_gameSystemId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** RULE_BOOK by game_system_id, named 'ruleBookList'. */
    protected List<DbRuleBook> _ruleBookList;

    /**
     * [get] RULE_BOOK by game_system_id, named 'ruleBookList'.
     * @return The entity list of referrer property 'ruleBookList'. (NotNull: even if no loading, returns empty list)
     */
    public List<DbRuleBook> getRuleBookList() {
        if (_ruleBookList == null) { _ruleBookList = newReferrerList(); }
        return _ruleBookList;
    }

    /**
     * [set] RULE_BOOK by game_system_id, named 'ruleBookList'.
     * @param ruleBookList The entity list of referrer property 'ruleBookList'. (NullAllowed)
     */
    public void setRuleBookList(List<DbRuleBook> ruleBookList) {
        _ruleBookList = ruleBookList;
    }

    /** SCENARIO by game_system_id, named 'scenarioList'. */
    protected List<DbScenario> _scenarioList;

    /**
     * [get] SCENARIO by game_system_id, named 'scenarioList'.
     * @return The entity list of referrer property 'scenarioList'. (NotNull: even if no loading, returns empty list)
     */
    public List<DbScenario> getScenarioList() {
        if (_scenarioList == null) { _scenarioList = newReferrerList(); }
        return _scenarioList;
    }

    /**
     * [set] SCENARIO by game_system_id, named 'scenarioList'.
     * @param scenarioList The entity list of referrer property 'scenarioList'. (NullAllowed)
     */
    public void setScenarioList(List<DbScenario> scenarioList) {
        _scenarioList = scenarioList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof DbBsGameSystem) {
            DbBsGameSystem other = (DbBsGameSystem)obj;
            if (!xSV(_gameSystemId, other._gameSystemId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _gameSystemId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_ruleBookList != null) { for (DbRuleBook et : _ruleBookList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "ruleBookList")); } } }
        if (_scenarioList != null) { for (DbScenario et : _scenarioList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "scenarioList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_gameSystemId));
        sb.append(dm).append(xfND(_gameSystemName));
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
        if (_ruleBookList != null && !_ruleBookList.isEmpty())
        { sb.append(dm).append("ruleBookList"); }
        if (_scenarioList != null && !_scenarioList.isEmpty())
        { sb.append(dm).append("scenarioList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public DbGameSystem clone() {
        return (DbGameSystem)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] game_system_id: {PK, ID, NotNull, INT UNSIGNED(10)} <br>
     * @return The value of the column 'game_system_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getGameSystemId() {
        checkSpecifiedProperty("gameSystemId");
        return _gameSystemId;
    }

    /**
     * [set] game_system_id: {PK, ID, NotNull, INT UNSIGNED(10)} <br>
     * @param gameSystemId The value of the column 'game_system_id'. (basically NotNull if update: for the constraint)
     */
    public void setGameSystemId(Integer gameSystemId) {
        registerModifiedProperty("gameSystemId");
        _gameSystemId = gameSystemId;
    }

    /**
     * [get] game_system_name: {NotNull, VARCHAR(255)} <br>
     * @return The value of the column 'game_system_name'. (basically NotNull if selected: for the constraint)
     */
    public String getGameSystemName() {
        checkSpecifiedProperty("gameSystemName");
        return convertEmptyToNull(_gameSystemName);
    }

    /**
     * [set] game_system_name: {NotNull, VARCHAR(255)} <br>
     * @param gameSystemName The value of the column 'game_system_name'. (basically NotNull if update: for the constraint)
     */
    public void setGameSystemName(String gameSystemName) {
        registerModifiedProperty("gameSystemName");
        _gameSystemName = gameSystemName;
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
