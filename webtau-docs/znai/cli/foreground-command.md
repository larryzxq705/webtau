Webtau can run commands in `foreground` and in `background`. When command is ran in `foreground` webtau will 
wait for the command to finish.

# Run

To run a command use `cli.run` with a single string parameter that includes a command and 
all its arguments:   

:include-file: doc-artifacts/snippets/foreground-cli/withoutValidation.groovy {
  title: "run command"
}

# Run With Validation

:include-file: doc-artifacts/snippets/foreground-cli/withOutputValidation.groovy {
  title: "output validation"
}

:include-file: doc-artifacts/snippets/foreground-cli/withErrorValidation.groovy {
  title: "error validation"
}

:include-file: doc-artifacts/snippets/foreground-cli/withExitCodeValidation.groovy {
  title: "exit code validation"
}

# Implicit Exit Code Validation

Webtau performs implicit exit code validation and adds `exitCode` equals zero when 
you don't specify explicit `exitCode` validation. 

:include-file: doc-artifacts/snippets/foreground-cli/withoutValidation.groovy {
  title: "implicit exit validation happens here"
}

Example above is equivalent to 

:include-file: doc-artifacts/snippets/foreground-cli/implicitExitCodeBehindScenes.groovy {
  title: "exit code check webtau performs if you don't write explicit validation"
}

# Run Result

Use the result of `cli.run` if you need to process the output of the command.

:include-file: doc-artifacts/snippets/foreground-cli/runResult.groovy {
  title: "using run result"
}

Warning: Perform validation inside validation block so webtau can track what was checked.

# Working Dir

Use `cli.workingDir` as a second parameter to `cli.run` to set a working dir:

:include-file: doc-artifacts/snippets/foreground-cli-cfg/workingDir.groovy {
  title: "set working dir"
}

# Environment Variables

Use `cli.env` as a second parameter to `cli.run` to set the environment variables:

:include-file: doc-artifacts/snippets/foreground-cli-cfg/envVar.groovy {
  title: "set environment variable"
}

# Chain Cli Run Config

Combine configs by using `cli.env(...).workingDir(...)` in any order to set both:

:include-file: doc-artifacts/snippets/foreground-cli-cfg/envVarAndWorkingDir.groovy {
  title: "set environment variable and working dir"
}

