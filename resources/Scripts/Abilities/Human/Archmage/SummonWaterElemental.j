scope SummonWaterElemental initializer register
	struct AbilitySummonWaterElemental extends AbilitySpellNoTarget
		static constant integer ORDER_ID = OrderId("waterelemental")

		integer summonUnitId
		integer summonUnitCount
		integer buffId
		real areaOfEffect

		public static method create takes integer aliasId returns thistype
			return .allocate(aliasId, ORDER_ID)
		endmethod

		method populateData takes gameobject editorData, integer level returns nothing
			this.summonUnitId = GetGameObjectFieldAsID(editorData, ABILITY_FIELD_UNIT_ID + I2S(level), 0)
			this.summonUnitCount = GetGameObjectFieldAsInteger(editorData, ABILITY_FIELD_DATA_A + I2S(level), 0)
			this.buffId = GetGameObjectBuffID(editorData, level, 0)
			this.areaOfEffect = GetGameObjectFieldAsReal(editorData, ABILITY_FIELD_AREA_OF_EFFECT + I2S(level), 0)
		endmethod

		method doEffect takes unit caster, abilitytarget target returns boolean
			real facing = GetUnitFacing(caster)
			real facingRad = facing * bj_DEGTORAD
			real x = GetUnitX(caster) + (Cos(facingRad) * areaOfEffect)
			real y = GetUnitY(caster) + (Sin(facingRad) * areaOfEffect)
			integer i = 0
			player owner = GetOwningPlayer(caster)
			unit summonedUnit
			loop
				exitwhen i >= summonUnitCount
				set summonedUnit = CreateUnit(owner, summonUnitId, x, y, facing)
				call UnitAddType(summonedUnit, UNIT_TYPE_SUMMONED)
				//call UnitApplyTimedLife(summonedUnit, this.buffId)
				call DestroyEffect(AddSpellEffectTargetById(this.getAliasId(), EFFECT_TYPE_TARGET, summonedUnit, null))
				set i = i + 1
			endloop
			return false
		endmethod
	endstruct

	private function register takes nothing returns nothing
		call RegisterAbilityStructType('AHwe', AbilitySummonWaterElemental)
	endfunction
endscope