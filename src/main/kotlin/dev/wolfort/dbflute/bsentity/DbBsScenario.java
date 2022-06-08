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
 * The entity of SCENARIO as TABLE. <br>
 * <pre>
 * [primary-key]
 *     scenario_id
 *
 * [column]
 *     scenario_id, scenario_name, scenario_type, scenario_link, register_datetime, register_trace, update_datetime, update_trace
 *
 * [sequence]
 *     
 *
 * [identity]
 *     scenario_id
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     PARTICIPATE, SCENARIO_DICTIONARY
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     participateList, scenarioDictionaryList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer scenarioId = entity.getScenarioId();
 * String scenarioName = entity.getScenarioName();
 * String scenarioType = entity.getScenarioType();
 * String scenarioLink = entity.getScenarioLink();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String registerTrace = entity.getRegisterTrace();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * String updateTrace = entity.getUpdateTrace();
 * entity.setScenarioId(scenarioId);
 * entity.setScenarioName(scenarioName);
 * entity.setScenarioType(scenarioType);
 * entity.setScenarioLink(scenarioLink);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setRegisterTrace(registerTrace);
 * entity.setUpdateDatetime(updateDatetime);
 * entity.setUpdateTrace(updateTrace);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class DbBsScenario extends AbstractEntity implements DomainEntity, DbEntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** scenario_id: {PK, ID, NotNull, INT UNSIGNED(10)} */
    protected Integer _scenarioId;

    /** scenario_name: {NotNull, VARCHAR(255)} */
    protected String _scenarioName;

    /** scenario_type: {NotNull, VARCHAR(50)} */
    protected String _scenarioType;

    /** scenario_link: {NotNull, VARCHAR(255)} */
    protected String _scenarioLink;

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
        return "scenario";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_scenarioId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** PARTICIPATE by scenario_id, named 'participateList'. */
    protected List<DbParticipate> _participateList;

    /**
     * [get] PARTICIPATE by scenario_id, named 'participateList'.
     * @return The entity list of referrer property 'participateList'. (NotNull: even if no loading, returns empty list)
     */
    public List<DbParticipate> getParticipateList() {
        if (_participateList == null) { _participateList = newReferrerList(); }
        return _participateList;
    }

    /**
     * [set] PARTICIPATE by scenario_id, named 'participateList'.
     * @param participateList The entity list of referrer property 'participateList'. (NullAllowed)
     */
    public void setParticipateList(List<DbParticipate> participateList) {
        _participateList = participateList;
    }

    /** SCENARIO_DICTIONARY by scenario_id, named 'scenarioDictionaryList'. */
    protected List<DbScenarioDictionary> _scenarioDictionaryList;

    /**
     * [get] SCENARIO_DICTIONARY by scenario_id, named 'scenarioDictionaryList'.
     * @return The entity list of referrer property 'scenarioDictionaryList'. (NotNull: even if no loading, returns empty list)
     */
    public List<DbScenarioDictionary> getScenarioDictionaryList() {
        if (_scenarioDictionaryList == null) { _scenarioDictionaryList = newReferrerList(); }
        return _scenarioDictionaryList;
    }

    /**
     * [set] SCENARIO_DICTIONARY by scenario_id, named 'scenarioDictionaryList'.
     * @param scenarioDictionaryList The entity list of referrer property 'scenarioDictionaryList'. (NullAllowed)
     */
    public void setScenarioDictionaryList(List<DbScenarioDictionary> scenarioDictionaryList) {
        _scenarioDictionaryList = scenarioDictionaryList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof DbBsScenario) {
            DbBsScenario other = (DbBsScenario)obj;
            if (!xSV(_scenarioId, other._scenarioId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _scenarioId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_participateList != null) { for (DbParticipate et : _participateList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "participateList")); } } }
        if (_scenarioDictionaryList != null) { for (DbScenarioDictionary et : _scenarioDictionaryList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "scenarioDictionaryList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_scenarioId));
        sb.append(dm).append(xfND(_scenarioName));
        sb.append(dm).append(xfND(_scenarioType));
        sb.append(dm).append(xfND(_scenarioLink));
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
        if (_participateList != null && !_participateList.isEmpty())
        { sb.append(dm).append("participateList"); }
        if (_scenarioDictionaryList != null && !_scenarioDictionaryList.isEmpty())
        { sb.append(dm).append("scenarioDictionaryList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public DbScenario clone() {
        return (DbScenario)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] scenario_id: {PK, ID, NotNull, INT UNSIGNED(10)} <br>
     * @return The value of the column 'scenario_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getScenarioId() {
        checkSpecifiedProperty("scenarioId");
        return _scenarioId;
    }

    /**
     * [set] scenario_id: {PK, ID, NotNull, INT UNSIGNED(10)} <br>
     * @param scenarioId The value of the column 'scenario_id'. (basically NotNull if update: for the constraint)
     */
    public void setScenarioId(Integer scenarioId) {
        registerModifiedProperty("scenarioId");
        _scenarioId = scenarioId;
    }

    /**
     * [get] scenario_name: {NotNull, VARCHAR(255)} <br>
     * @return The value of the column 'scenario_name'. (basically NotNull if selected: for the constraint)
     */
    public String getScenarioName() {
        checkSpecifiedProperty("scenarioName");
        return convertEmptyToNull(_scenarioName);
    }

    /**
     * [set] scenario_name: {NotNull, VARCHAR(255)} <br>
     * @param scenarioName The value of the column 'scenario_name'. (basically NotNull if update: for the constraint)
     */
    public void setScenarioName(String scenarioName) {
        registerModifiedProperty("scenarioName");
        _scenarioName = scenarioName;
    }

    /**
     * [get] scenario_type: {NotNull, VARCHAR(50)} <br>
     * @return The value of the column 'scenario_type'. (basically NotNull if selected: for the constraint)
     */
    public String getScenarioType() {
        checkSpecifiedProperty("scenarioType");
        return convertEmptyToNull(_scenarioType);
    }

    /**
     * [set] scenario_type: {NotNull, VARCHAR(50)} <br>
     * @param scenarioType The value of the column 'scenario_type'. (basically NotNull if update: for the constraint)
     */
    public void setScenarioType(String scenarioType) {
        registerModifiedProperty("scenarioType");
        _scenarioType = scenarioType;
    }

    /**
     * [get] scenario_link: {NotNull, VARCHAR(255)} <br>
     * @return The value of the column 'scenario_link'. (basically NotNull if selected: for the constraint)
     */
    public String getScenarioLink() {
        checkSpecifiedProperty("scenarioLink");
        return convertEmptyToNull(_scenarioLink);
    }

    /**
     * [set] scenario_link: {NotNull, VARCHAR(255)} <br>
     * @param scenarioLink The value of the column 'scenario_link'. (basically NotNull if update: for the constraint)
     */
    public void setScenarioLink(String scenarioLink) {
        registerModifiedProperty("scenarioLink");
        _scenarioLink = scenarioLink;
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
