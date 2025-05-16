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
 * The entity of SCENARIO_GAME_SYSTEM as TABLE. <br>
 * <pre>
 * [primary-key]
 *     scenario_game_system_id
 *
 * [column]
 *     scenario_game_system_id, scenario_id, game_system_id, register_datetime, register_trace, update_datetime, update_trace
 *
 * [sequence]
 *     
 *
 * [identity]
 *     scenario_game_system_id
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     GAME_SYSTEM, SCENARIO
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     gameSystem, scenario
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer scenarioGameSystemId = entity.getScenarioGameSystemId();
 * Integer scenarioId = entity.getScenarioId();
 * Integer gameSystemId = entity.getGameSystemId();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String registerTrace = entity.getRegisterTrace();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * String updateTrace = entity.getUpdateTrace();
 * entity.setScenarioGameSystemId(scenarioGameSystemId);
 * entity.setScenarioId(scenarioId);
 * entity.setGameSystemId(gameSystemId);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setRegisterTrace(registerTrace);
 * entity.setUpdateDatetime(updateDatetime);
 * entity.setUpdateTrace(updateTrace);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class DbBsScenarioGameSystem extends AbstractEntity implements DomainEntity, DbEntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** scenario_game_system_id: {PK, ID, NotNull, INT UNSIGNED(10)} */
    protected Integer _scenarioGameSystemId;

    /** scenario_id: {IX, NotNull, INT UNSIGNED(10), FK to scenario} */
    protected Integer _scenarioId;

    /** game_system_id: {IX, NotNull, INT UNSIGNED(10), FK to game_system} */
    protected Integer _gameSystemId;

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
        return "scenario_game_system";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_scenarioGameSystemId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** GAME_SYSTEM by my game_system_id, named 'gameSystem'. */
    protected OptionalEntity<DbGameSystem> _gameSystem;

    /**
     * [get] GAME_SYSTEM by my game_system_id, named 'gameSystem'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'gameSystem'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<DbGameSystem> getGameSystem() {
        if (_gameSystem == null) { _gameSystem = OptionalEntity.relationEmpty(this, "gameSystem"); }
        return _gameSystem;
    }

    /**
     * [set] GAME_SYSTEM by my game_system_id, named 'gameSystem'.
     * @param gameSystem The entity of foreign property 'gameSystem'. (NullAllowed)
     */
    public void setGameSystem(OptionalEntity<DbGameSystem> gameSystem) {
        _gameSystem = gameSystem;
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
        if (obj instanceof DbBsScenarioGameSystem) {
            DbBsScenarioGameSystem other = (DbBsScenarioGameSystem)obj;
            if (!xSV(_scenarioGameSystemId, other._scenarioGameSystemId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _scenarioGameSystemId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_gameSystem != null && _gameSystem.isPresent())
        { sb.append(li).append(xbRDS(_gameSystem, "gameSystem")); }
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
        sb.append(dm).append(xfND(_scenarioGameSystemId));
        sb.append(dm).append(xfND(_scenarioId));
        sb.append(dm).append(xfND(_gameSystemId));
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
        if (_gameSystem != null && _gameSystem.isPresent())
        { sb.append(dm).append("gameSystem"); }
        if (_scenario != null && _scenario.isPresent())
        { sb.append(dm).append("scenario"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public DbScenarioGameSystem clone() {
        return (DbScenarioGameSystem)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] scenario_game_system_id: {PK, ID, NotNull, INT UNSIGNED(10)} <br>
     * @return The value of the column 'scenario_game_system_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getScenarioGameSystemId() {
        checkSpecifiedProperty("scenarioGameSystemId");
        return _scenarioGameSystemId;
    }

    /**
     * [set] scenario_game_system_id: {PK, ID, NotNull, INT UNSIGNED(10)} <br>
     * @param scenarioGameSystemId The value of the column 'scenario_game_system_id'. (basically NotNull if update: for the constraint)
     */
    public void setScenarioGameSystemId(Integer scenarioGameSystemId) {
        registerModifiedProperty("scenarioGameSystemId");
        _scenarioGameSystemId = scenarioGameSystemId;
    }

    /**
     * [get] scenario_id: {IX, NotNull, INT UNSIGNED(10), FK to scenario} <br>
     * @return The value of the column 'scenario_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getScenarioId() {
        checkSpecifiedProperty("scenarioId");
        return _scenarioId;
    }

    /**
     * [set] scenario_id: {IX, NotNull, INT UNSIGNED(10), FK to scenario} <br>
     * @param scenarioId The value of the column 'scenario_id'. (basically NotNull if update: for the constraint)
     */
    public void setScenarioId(Integer scenarioId) {
        registerModifiedProperty("scenarioId");
        _scenarioId = scenarioId;
    }

    /**
     * [get] game_system_id: {IX, NotNull, INT UNSIGNED(10), FK to game_system} <br>
     * @return The value of the column 'game_system_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getGameSystemId() {
        checkSpecifiedProperty("gameSystemId");
        return _gameSystemId;
    }

    /**
     * [set] game_system_id: {IX, NotNull, INT UNSIGNED(10), FK to game_system} <br>
     * @param gameSystemId The value of the column 'game_system_id'. (basically NotNull if update: for the constraint)
     */
    public void setGameSystemId(Integer gameSystemId) {
        registerModifiedProperty("gameSystemId");
        _gameSystemId = gameSystemId;
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
