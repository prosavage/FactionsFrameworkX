package io.illyria.factionsframeworkx

import net.prosavage.baseplugin.SavagePlugin

class FactionsFramework : SavagePlugin() {

    public override fun onEnable() {
        // Framework initialization.
        super.onEnable()
        loadFiles()

    }

    private fun loadFiles() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    public override fun onDisable() {
        super.onDisable()
        saveFiles()
    }

    private fun saveFiles() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}