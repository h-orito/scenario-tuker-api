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
 *     scenario_id, scenario_name, scenario_type, scenario_url, game_master_requirement, player_num_min, player_num_max, required_hours, register_datetime, register_trace, update_datetime, update_trace
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
 *     PARTICIPATE, SCENARIO_AUTHOR, SCENARIO_DICTIONARY, SCENARIO_GAME_SYSTEM, USER_SCENARIO
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     participateList, scenarioAuthorList, scenarioDictionaryList, scenarioGameSystemList, userScenarioList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer scenarioId = entity.getScenarioId();
 * String scenarioName = entity.getScenarioName();
 * String scenarioType = entity.getScenarioType();
 * String scenarioUrl = entity.getScenarioUrl();
 * String gameMasterRequirement = entity.getGameMasterRequirement();
 * Integer playerNumMin = entity.getPlayerNumMin();
 * Integer playerNumMax = entity.getPlayerNumMax();
 * Integer requiredHours = entity.getRequiredHours();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String registerTrace = entity.getRegisterTrace();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * String updateTrace = entity.getUpdateTrace();
 * entity.setScenarioId(scenarioId);
 * entity.setScenarioName(scenarioName);
 * entity.setScenarioType(scenarioType);
 * entity.setScenarioUrl(scenarioUrl);
 * entity.setGameMasterRequirement(gameMasterRequirement);
 * entity.setPlayerNumMin(playerNumMin);
 * entity.setPlayerNumMax(playerNumMax);
 * entity.setRequiredHours(requiredHours);
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

    /** scenario_url: {VARCHAR(255)} */
    protected String _scenarioUrl;

    /** game_master_requirement: {VARCHAR(50)} */
    protected String _gameMasterRequirement;

    /** player_num_min: {INT UNSIGNED(10)} */
    protected Integer _playerNumMin;

    /** player_num_max: {INT UNSIGNED(10)} */
    protected Integer _playerNumMax;

    /** required_hours: {INT UNSIGNED(10)} */
    protected Integer _requiredHours;

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

    /** SCENARIO_AUTHOR by scenario_id, named 'scenarioAuthorList'. */
    protected List<DbScenarioAuthor> _scenarioAuthorList;

    /**
     * [get] SCENARIO_AUTHOR by scenario_id, named 'scenarioAuthorList'.
     * @return The entity list of referrer property 'scenarioAuthorList'. (NotNull: even if no loading, returns empty list)
     */
    public List<DbScenarioAuthor> getScenarioAuthorList() {
        if (_scenarioAuthorList == null) { _scenarioAuthorList = newReferrerList(); }
        return _scenarioAuthorList;
    }

    /**
     * [set] SCENARIO_AUTHOR by scenario_id, named 'scenarioAuthorList'.
     * @param scenarioAuthorList The entity list of referrer property 'scenarioAuthorList'. (NullAllowed)
     */
    public void setScenarioAuthorList(List<DbScenarioAuthor> scenarioAuthorList) {
        _scenarioAuthorList = scenarioAuthorList;
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

    /** SCENARIO_GAME_SYSTEM by scenario_id, named 'scenarioGameSystemList'. */
    protected List<DbScenarioGameSystem> _scenarioGameSystemList;

    /**
     * [get] SCENARIO_GAME_SYSTEM by scenario_id, named 'scenarioGameSystemList'.
     * @return The entity list of referrer property 'scenarioGameSystemList'. (NotNull: even if no loading, returns empty list)
     */
    public List<DbScenarioGameSystem> getScenarioGameSystemList() {
        if (_scenarioGameSystemList == null) { _scenarioGameSystemList = newReferrerList(); }
        return _scenarioGameSystemList;
    }

    /**
     * [set] SCENARIO_GAME_SYSTEM by scenario_id, named 'scenarioGameSystemList'.
     * @param scenarioGameSystemList The entity list of referrer property 'scenarioGameSystemList'. (NullAllowed)
     */
    public void setScenarioGameSystemList(List<DbScenarioGameSystem> scenarioGameSystemList) {
        _scenarioGameSystemList = scenarioGameSystemList;
    }

    /** USER_SCENARIO by scenario_id, named 'userScenarioList'. */
    protected List<DbUserScenario> _userScenarioList;

    /**
     * [get] USER_SCENARIO by scenario_id, named 'userScenarioList'.
     * @return The entity list of referrer property 'userScenarioList'. (NotNull: even if no loading, returns empty list)
     */
    public List<DbUserScenario> getUserScenarioList() {
        if (_userScenarioList == null) { _userScenarioList = newReferrerList(); }
        return _userScenarioList;
    }

    /**
     * [set] USER_SCENARIO by scenario_id, named 'userScenarioList'.
     * @param userScenarioList The entity list of referrer property 'userScenarioList'. (NullAllowed)
     */
    public void setUserScenarioList(List<DbUserScenario> userScenarioList) {
        _userScenarioList = userScenarioList;
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
        if (_scenarioAuthorList != null) { for (DbScenarioAuthor et : _scenarioAuthorList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "scenarioAuthorList")); } } }
        if (_scenarioDictionaryList != null) { for (DbScenarioDictionary et : _scenarioDictionaryList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "scenarioDictionaryList")); } } }
        if (_scenarioGameSystemList != null) { for (DbScenarioGameSystem et : _scenarioGameSystemList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "scenarioGameSystemList")); } } }
        if (_userScenarioList != null) { for (DbUserScenario et : _userScenarioList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "userScenarioList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_scenarioId));
        sb.append(dm).append(xfND(_scenarioName));
        sb.append(dm).append(xfND(_scenarioType));
        sb.append(dm).append(xfND(_scenarioUrl));
        sb.append(dm).append(xfND(_gameMasterRequirement));
        sb.append(dm).append(xfND(_playerNumMin));
        sb.append(dm).append(xfND(_playerNumMax));
        sb.append(dm).append(xfND(_requiredHours));
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
        if (_scenarioAuthorList != null && !_scenarioAuthorList.isEmpty())
        { sb.append(dm).append("scenarioAuthorList"); }
        if (_scenarioDictionaryList != null && !_scenarioDictionaryList.isEmpty())
        { sb.append(dm).append("scenarioDictionaryList"); }
        if (_scenarioGameSystemList != null && !_scenarioGameSystemList.isEmpty())
        { sb.append(dm).append("scenarioGameSystemList"); }
        if (_userScenarioList != null && !_userScenarioList.isEmpty())
        { sb.append(dm).append("userScenarioList"); }
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
     * [get] scenario_url: {VARCHAR(255)} <br>
     * @return The value of the column 'scenario_url'. (NullAllowed even if selected: for no constraint)
     */
    public String getScenarioUrl() {
        checkSpecifiedProperty("scenarioUrl");
        return convertEmptyToNull(_scenarioUrl);
    }

    /**
     * [set] scenario_url: {VARCHAR(255)} <br>
     * @param scenarioUrl The value of the column 'scenario_url'. (NullAllowed: null update allowed for no constraint)
     */
    public void setScenarioUrl(String scenarioUrl) {
        registerModifiedProperty("scenarioUrl");
        _scenarioUrl = scenarioUrl;
    }

    /**
     * [get] game_master_requirement: {VARCHAR(50)} <br>
     * @return The value of the column 'game_master_requirement'. (NullAllowed even if selected: for no constraint)
     */
    public String getGameMasterRequirement() {
        checkSpecifiedProperty("gameMasterRequirement");
        return convertEmptyToNull(_gameMasterRequirement);
    }

    /**
     * [set] game_master_requirement: {VARCHAR(50)} <br>
     * @param gameMasterRequirement The value of the column 'game_master_requirement'. (NullAllowed: null update allowed for no constraint)
     */
    public void setGameMasterRequirement(String gameMasterRequirement) {
        registerModifiedProperty("gameMasterRequirement");
        _gameMasterRequirement = gameMasterRequirement;
    }

    /**
     * [get] player_num_min: {INT UNSIGNED(10)} <br>
     * @return The value of the column 'player_num_min'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getPlayerNumMin() {
        checkSpecifiedProperty("playerNumMin");
        return _playerNumMin;
    }

    /**
     * [set] player_num_min: {INT UNSIGNED(10)} <br>
     * @param playerNumMin The value of the column 'player_num_min'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPlayerNumMin(Integer playerNumMin) {
        registerModifiedProperty("playerNumMin");
        _playerNumMin = playerNumMin;
    }

    /**
     * [get] player_num_max: {INT UNSIGNED(10)} <br>
     * @return The value of the column 'player_num_max'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getPlayerNumMax() {
        checkSpecifiedProperty("playerNumMax");
        return _playerNumMax;
    }

    /**
     * [set] player_num_max: {INT UNSIGNED(10)} <br>
     * @param playerNumMax The value of the column 'player_num_max'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPlayerNumMax(Integer playerNumMax) {
        registerModifiedProperty("playerNumMax");
        _playerNumMax = playerNumMax;
    }

    /**
     * [get] required_hours: {INT UNSIGNED(10)} <br>
     * @return The value of the column 'required_hours'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getRequiredHours() {
        checkSpecifiedProperty("requiredHours");
        return _requiredHours;
    }

    /**
     * [set] required_hours: {INT UNSIGNED(10)} <br>
     * @param requiredHours The value of the column 'required_hours'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRequiredHours(Integer requiredHours) {
        registerModifiedProperty("requiredHours");
        _requiredHours = requiredHours;
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
