import hudson.plugins.git.*;

def scm = new GitSCM("https://github.com/RubenSemiao/jenkins-jobs.git")
scm.branches = [new BranchSpec("*/develop")];

def flowDefinition = new org.jenkinsci.plugins.workflow.cps.CpsScmFlowDefinition(scm, "Jenkinsfile")

def parent = Jenkins.instance
def job = new org.jenkinsci.plugins.workflow.job.WorkflowJob(parent, "New Job")
job.definition = flowDefinition

parent.reload()