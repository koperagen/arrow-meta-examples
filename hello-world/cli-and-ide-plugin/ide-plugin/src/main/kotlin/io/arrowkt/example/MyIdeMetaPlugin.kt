package io.arrowkt.example

import arrow.meta.CliPlugin
import arrow.meta.ide.IdePlugin
import arrow.meta.ide.MetaIde
import arrow.meta.ide.phases.IdeContext
import arrow.meta.phases.CompilerContext
import io.arrowkt.example.plugins.helloWorld
import kotlin.contracts.ExperimentalContracts

@ExperimentalContracts
class MyIdeMetaPlugin : MetaIde {
  @ExperimentalContracts
  override fun intercept(ctx: CompilerContext): List<CliPlugin> =
    emptyList()

  @ExperimentalContracts
  override fun intercept(ctx: IdeContext): List<IdePlugin> =
    listOf(
      helloWorld
    )
}
