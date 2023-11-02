package com.etheller.warsmash.viewer5.handlers.w3x.simulation.abilitybuilder.parser;

import com.etheller.warsmash.viewer5.handlers.w3x.simulation.abilitybuilder.behavior.callback.floatcallbacks.ABFloatCallback;
import com.etheller.warsmash.viewer5.handlers.w3x.simulation.abilitybuilder.behavior.callback.idcallbacks.ABIDCallback;
import com.etheller.warsmash.viewer5.handlers.w3x.simulation.abilitybuilder.behavior.callback.integercallbacks.ABIntegerCallback;

public class AbilityBuilderOverrideFields {
	
	private ABFloatCallback areaOverride;
	private ABFloatCallback rangeOverride;
	private ABFloatCallback cooldownOverride;
	private ABIntegerCallback manaCostOverride;
	
	private ABIDCallback onTooltipOverride;
	private ABIDCallback offTooltipOverride;
	
	public ABFloatCallback getAreaOverride() {
		return areaOverride;
	}
	public void setAreaOverride(ABFloatCallback areaOverride) {
		this.areaOverride = areaOverride;
	}
	public ABFloatCallback getRangeOverride() {
		return rangeOverride;
	}
	public void setRangeOverride(ABFloatCallback rangeOverride) {
		this.rangeOverride = rangeOverride;
	}
	public ABFloatCallback getCooldownOverride() {
		return cooldownOverride;
	}
	public void setCooldownOverride(ABFloatCallback cooldownOverride) {
		this.cooldownOverride = cooldownOverride;
	}
	public ABIntegerCallback getManaCostOverride() {
		return manaCostOverride;
	}
	public void setManaCostOverride(ABIntegerCallback manaCostOverride) {
		this.manaCostOverride = manaCostOverride;
	}
	public ABIDCallback getOnTooltipOverride() {
		return onTooltipOverride;
	}
	public void setOnTooltipOverride(ABIDCallback onTooltipOverride) {
		this.onTooltipOverride = onTooltipOverride;
	}
	public ABIDCallback getOffTooltipOverride() {
		return offTooltipOverride;
	}
	public void setOffTooltipOverride(ABIDCallback offTooltipOverride) {
		this.offTooltipOverride = offTooltipOverride;
	}
	
	

}