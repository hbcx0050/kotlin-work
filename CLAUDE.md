# CLAUDE.md

Guidance for Claude (or any AI assistant) working in this repository.

## What this repo is

Andy's fork of the COMP2850 (Software Engineering, University of Leeds) Kotlin
coursework repo, covering the first five weeks of the module.

- `tasks/taskN_M[_K]/`: classroom tasks, numbered by section of the
  [Kotlin Programming Guide](https://comp2850.github.io/kotlin-guide/). Not assessed.
  Many READMEs refer to "suggested" code that lives in the guide, not the repo,
  so fetch the matching guide page.
- `portfolio/weekN/`: **assessed** portfolio assignments, submitted to Gradescope
  (upload `Main.kt` only, never "submit from GitHub"). Each has a `check.py`
  autograder replica. **Never modify `check.py`.**
- Staff inspect this repo, so code style and commit messages matter.

## AI usage rules (from the module's portfolio brief)

AI may be used **only in a supportive, tutoring capacity**.

Allowed: explaining or clarifying topics, concepts, Kotlin syntax, error
messages and task instructions.

Not allowed for portfolio work: producing code, writing or other artefacts that
get submitted, or debugging/"fixing" the student's code.

How to apply this:

- **Portfolio (`portfolio/`)**: never write, edit, or suggest specific line-level
  fixes to submission code. Explain concepts with *unrelated* examples. Running
  `check.py` and relaying its output verbatim is fine; interpreting failures
  should stay at the level of "what does this message mean", not "change line X
  to Y". If a request crosses the line, say so plainly and suggest asking in a
  timetabled session.
- **Classroom tasks (`tasks/`)**: explain the task, point to the right guide
  section, give hints and conceptual guidance. Andy writes the code.
  Reviewing finished task code and explaining what it does or misses is OK.
- Never edit `.kt` source files unless Andy explicitly asks for that specific
  change, and record it in the log if so.

## Logging AI usage (required)

`AI_USAGE_LOG.md` is the record of how AI was used in this repo. **At the end of
every session (or after each task/portfolio piece), append an entry** using the
template at the top of that file. Be factual and complete, including anything
in a grey area. Never rewrite or delete past entries; add corrections as new
entries.

## Workflow

- Work through tasks in numeric order (see the log for where things are up to).
- Run tasks from their own directory: `./kotlin build`, `./kotlin run`,
  `./kotlin test`. Some tasks use Gradle instead (`./gradlew run`).
- A global `kotlin` command is installed at `~/.local/bin/kotlin` (copy of the
  project wrapper), so `kotlin init` works in empty task folders.
- Commit each task separately when Andy says it's done, with a message like
  `Task 4.2: if expressions and ranges`.
- **Always `git pull` before starting** (work happens across multiple machines and
  sessions) and **push after committing**. The remote uses SSH
  (`git@github.com:hbcx0050/kotlin-work.git`); HTTPS push fails non-interactively.

## Andy's preferences

- New to Kotlin. Prefers concise, direct explanations.
- Wants to be told what a task is about, what to read, and guidance, then writes
  the code and asks Claude to run/check and commit.
