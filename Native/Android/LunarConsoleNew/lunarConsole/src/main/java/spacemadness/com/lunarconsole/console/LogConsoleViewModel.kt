package spacemadness.com.lunarconsole.console

import spacemadness.com.lunarconsole.core.Observable

class LogConsoleViewModel(private val console: LogConsole) {
    val dataSource = object : DataSource<LogEntry> {
        override fun getItemCount() = console.itemCount
        override fun getItem(position: Int) = console.get(position)
    }

    val diffStream: Observable<LogEntryList.Diff> = console.diffStream
}